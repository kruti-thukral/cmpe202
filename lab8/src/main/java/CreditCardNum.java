/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends displayComponent
{

	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return number;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			if(ch.toLowerCase().matches("x|delete") && number.length()>0) {
				number = number.substring(0, number.length()-1);
			}
			else {
				number += ch;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}