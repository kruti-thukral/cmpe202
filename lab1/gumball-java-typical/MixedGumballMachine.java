
/**
 * Below class is a type of gumball machine which accepts only 
 * quarter/nickel/dime and ejects a gumball for every 50 cents inserted
 *
 * @kruti thukral
 * @1.0
 */
public class MixedGumballMachine extends GumballMachine
{
    private int sum = 0; // variable that keeps track of the amount inserted in the machine
    public MixedGumballMachine( int size )
    {
        super(size); // call base class constructor for basic initialisation
        System.out.println("Creating Mixed Half Dollar Gumball Machine");
    }

    public void insertQuarter(int coin)
    {
       if ( coin == 25 ||  coin == 5 || coin == 10) {
            this.sum = this.sum + coin; // Increment amount inserted accordingly
            System.out.println( "Received amount:" + coin ) ;
        }
        else // Notify user when inserted coin is not of accepted type
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
    			num_gumballs-- ; // decrement gumball count
    			this.sum = this.sum - 50;  // Increment amount inserted accordingly
    			System.out.println( "Thanks for inserting 50 cents.  Gumball Ejected!" ) ;
    		}
    		else // error when machine is out of gumballs
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else // error when required amount is not inserted for ejecting a gumball
    	{
    		System.out.println( "50 cents required for a gumball. You inserted " + sum + " cents" ) ;
    	}    
    }
}
