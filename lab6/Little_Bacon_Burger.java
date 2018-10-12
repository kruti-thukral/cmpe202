import java.text.DecimalFormat;
/**
 * Write a description of class Little_Bacon_Burger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Little_Bacon_Burger extends CustomBurger
{
 
    public Little_Bacon_Burger( )
    {
        super("LBB") ;
        price = 5.59;
        addChild(new Bacon());
        
        
    }
  
}
