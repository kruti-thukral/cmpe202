
/**
 * Write a description of class QuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuarterGumballMachine extends GumballMachine
{
    public QuarterGumballMachine( int size )
    {
        super(size);
        System.out.println("Creating Quarter Gumball Machine. Accepts only quarters");
    }

    /* function to validate acceptable coin for the gumball machine*/
    public boolean validateCoin(int coin) {
        return  ( coin == 25 ?true:false);
    }

    /* getter function to retrieve the minimum amount required for a gumball*/
    public int getMinAmount() {
        return 25;
    }

}
