/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class cardNumberDecorator extends decorator
{   
    final static String space = " "; 
	public cardNumberDecorator(displayComponent c){
        super(c);
     }
  
	public String display() {
        String number = this.component.display();
        StringBuilder cardNumber = new StringBuilder();
        if ( number.equals("") )
            cardNumber.append("[4444 4444 4444 4444]" + "  ");
        else  {
            cardNumber.append("[");
            for(int index=0;index<number.length();index++) {
                if(index==4 || index==8 || index==12)
                    cardNumber.append(space + number.charAt(index));
                else
                    cardNumber.append(number.charAt(index));
            }
            cardNumber.append("]  ");
        }
		return cardNumber.toString();
	}	

	

}