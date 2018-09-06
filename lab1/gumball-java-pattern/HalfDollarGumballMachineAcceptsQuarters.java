/**
 * Below class is a type of gumball machine which ejects a gumball for every 50 cents inserted
 *
 * @kruti thukral
 * @1.0
 */
public class HalfDollarGumballMachineAcceptsQuarters extends HalfDollarGumballMachine
{

    public HalfDollarGumballMachineAcceptsQuarters( int size )
    {
        super(size); // call base class constructor for basic initialisation
        System.out.println("Creating Half Dollar Gumball Machine. Accepts only quarters");
    }

    /* function to validate acceptable coin for the gumball machine*/
    public boolean validateCoin(int coin) {
        return  ( coin == 25 ?true:false);
    }



}