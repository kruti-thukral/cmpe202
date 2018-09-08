/**
 * Below class is an abstract class for a gumball machine which ejects a gumball for every 50 cents
 *
 * @Kruti Thukral
 */
abstract class HalfDollarGumballMachine extends GumballMachine
{
   public static final int MIN_AMOUNT = 50;
    public HalfDollarGumballMachine( int size )
    {
        super(size); // call base class constructor for basic initialisation
    }

    /* getter function to retrieve the minimum amount required for a gumball*/
    public int getMinAmount() {
        return MIN_AMOUNT;
    }
}