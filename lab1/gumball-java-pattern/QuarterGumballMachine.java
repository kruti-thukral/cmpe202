
/**
 * Below class is a type of gumball machine which accepts only 
 * quarters and ejects a gumball for every quarter inserted
 *
 * @kruti thukral
 * @1.0
 */
public class QuarterGumballMachine extends GumballMachine
{
    public static final int MIN_AMOUNT = 25;
    public QuarterGumballMachine( int size )
    {
        super(size);
        System.out.println("Creating Quarter Gumball Machine. Accepts only quarters");
    }

    /* function to validate acceptable coin for the gumball machine*/
    public boolean validateCoin(int coin) {
        return  ( coin == QUARTER ?true:false);
    }

    /* getter function to retrieve the minimum amount required for a gumball*/
    public int getMinAmount() {
        return MIN_AMOUNT;
    }

}
