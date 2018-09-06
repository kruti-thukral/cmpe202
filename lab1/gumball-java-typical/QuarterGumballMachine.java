
/**
 * Below class is a type of gumball machine which accepts only 
 * quarters and ejects a gumball for every quarter inserted
 *
 * @kruti thukral
 * @1.0
 */
public class QuarterGumballMachine extends GumballMachine
{
    public QuarterGumballMachine( int size )
    {
        super(size);
        System.out.println("Creating Quarter Gumball Machine. Accepts only quarters");
    }

    public boolean validateCoin(int coin) {
        return  ( coin == 25 ?true:false);
    }
    
    public int getMinAmount() {
        return 25;
    }
}
