
/**
 * Write a description of class MixedGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MixedGumballMachine extends GumballMachine
{
    private int sum = 0;
    public MixedGumballMachine( int size )
    {
        // initialise instance variables
        super(size);
        System.out.println("Creating Mixed Half Dollar Gumball Machine");
    }

    public void insertQuarter(int coin)
    {
       if ( coin == 25 ||  coin == 5 || coin == 10) {
            this.sum = this.sum + coin;
            System.out.println( "Received coin:" + coin ) ;
        }
        else 
            System.out.println( "Please insert a quarter or a nickel or a dime. No other coins are accepted" ) ;
       
    }
    
    public void turnCrank()
    {
        System.out.println( "Crank turned" ) ;
        boolean required_quarters_inserted = (this.sum / 50 > 0?true:false);
        
        if ( required_quarters_inserted )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			this.sum = this.sum - 50; 
    			System.out.println( "Thanks for inserting 50 cents.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "50 cents required for a gumball. You inserted " + sum + " cents" ) ;
    	}    
    }
}
