
/**
 * Below class is the base abstract gumball machine which which is implemented by specific machine types
 *
 * @kruti thukral
 * @1.0
 */

abstract class GumballMachine
{

    private int num_gumballs;
    private int sum = 0; // variable that keeps track of the amount inserted in the machine
    public static final int QUARTER = 25;
    public static final int NICKEL = 5;
    public static final int DIME = 10;
    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
    }
    
    
    /*abstract functions which are implemented by the derived classes*/
    abstract int getMinAmount();
    abstract boolean validateCoin(int coin);
    
    /* below function is invoked when a coin is inserted in the machine*/
    public void insertCoin(int coin)
    {
       if ( validateCoin(coin) ) {
            incrementAmount(coin); // Increment amount inserted accordingly
            System.out.println( "Received " + coin + " cents" ) ;
        }
        else // Notify user when inserted coin is not of accepted type
            System.out.println( "Coin inserted is not of accepted type" ) ;
    }
    
    /* below function is a helper function for incrementing amount inserted in the gumball machine*/
    public void incrementAmount(int amount ) {
        this.sum = this.sum + amount;
    }
    
    /* below function is a helper function for decrementing amount inserted after a gumball is ejected*/
    public void decrementAmount(int amount ) {
        this.sum = this.sum - amount;
    }
    
    /* getter function to retrieve the amount inserted in the gumball machine*/
    public int getAmountInserted() {
        return sum;
    }
    
    
    public void reset() {
        sum = 0;
    }
    
    /* function to validate required anount for a gumball to be ejected from the machine*/
    public boolean validateAmount() {
        return (getAmountInserted() / getMinAmount() > 0?true:false);
    }
    
    /* function invoked when crank is turned. Ejects a gumball if required amount is inserted in the machine*/
    public void turnCrank()
    {
        System.out.println( "Crank turned" ) ;
        boolean required_quarters_inserted =  validateAmount();
        
        if ( required_quarters_inserted )
        {
            if ( num_gumballs > 0 )
            {
                
                num_gumballs-- ;// decrement gumball count
                decrementAmount(getMinAmount());// decrement amount inserted accordingly
                //reset();
                System.out.println( "Gumball Ejected!" ) ;
            }
            else // error when machine is out of gumballs
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
            }
        }
        else // error when required amount is not inserted for ejecting a gumball
        {
            System.out.println( getMinAmount() +  " cents required for a gumball. You inserted " + getAmountInserted() + " cents" ) ;
        }    
    }
    
}