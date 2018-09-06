abstract class GumballMachine
{

    private int num_gumballs;
    private int sum = 0; // variable that keeps track of the amount inserted in the machine

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
    }

    public void insertQuarter(int coin)
    {
       if ( validateCoin(coin) ) {
            incrementAmount(coin); // Increment amount inserted accordingly
            System.out.println( "Received " + coin + " cents" ) ;
        }
        else // Notify user when inserted coin is not of accepted type
            System.out.println( "Coin inserted is not of accepted type" ) ;
    }
    
   
    public void decrementAmount(int amount ) {
        this.sum = this.sum - amount;
    }
    
    public int getAmountInserted() {
        return sum;
    }
    
    public void incrementAmount(int amount ) {
        this.sum = this.sum + amount;
    }
    
    abstract int getMinAmount();
    abstract boolean validateCoin(int coin);
    
    public void reset() {
        sum = 0;
    }
    
    public boolean validateAmount() {
        return (getAmountInserted() / getMinAmount() > 0?true:false);
    }
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