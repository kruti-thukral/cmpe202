/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class displayComponent implements IDisplayComponent, IKeyEventHandler
{

	protected IKeyEventHandler nextHandler ;
	

    public void setNext( IKeyEventHandler next) {
    	// do nothing
    }	

	public String display() {
		return "";
	}	

	public void key(String ch, int cnt) {
		// do nothing
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}