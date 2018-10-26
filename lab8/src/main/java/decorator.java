/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class decorator extends displayComponent
{   
    protected displayComponent component;

	public decorator(displayComponent c){
        this.component = c;
     }
  

    public void setNext( IKeyEventHandler next) {
    	this.component.nextHandler = next ;
    }	

	public String display() {
        return this.component.display();
	}	

	public void key(String ch, int cnt) {
		this.component.key(ch, cnt);
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}