/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class cardExpiryDecorator extends decorator
{   
    final static String slash = "/"; 
	public cardExpiryDecorator(displayComponent c){
        super(c);
     }
  
	public String display() {
        String expiryDate = this.component.display();
        StringBuilder date = new StringBuilder();
        if ( expiryDate.equals("") )
            date.append("[MM/YY]" + "  ");
        else  {
            date.append("[");
            for(int i=0;i<expiryDate.length();i++) {
                if(i==2)
                    date.append(slash + expiryDate.charAt(i));
                else
                    date.append(expiryDate.charAt(i));
            }

            date.append("]  " );
        }
		return date.toString();
	}	

	

}