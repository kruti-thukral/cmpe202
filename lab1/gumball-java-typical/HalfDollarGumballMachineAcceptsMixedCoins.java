
/**
 * Below class is a type of gumball machine which accepts only 
 * quarter/nickel/dime and ejects a gumball for every 50 cents inserted
 *
 * @kruti thukral
 * @1.0
 */
public class HalfDollarGumballMachineAcceptsMixedCoins extends HalfDollarGumballMachine
{
    
    public HalfDollarGumballMachineAcceptsMixedCoins( int size )
    {
        super(size); // call base class constructor for basic initialisation
        System.out.println("Creating Half Dollar Gumball Machine . Accepts quarter/nickel/dime");
    }
    
    /* function to validate acceptable coin for the gumball machine*/
     public boolean validateCoin(int coin) {
        return  (( coin == QUARTER ||  coin == NICKEL || coin == DIME)?true:false);
    }
    
    
}
