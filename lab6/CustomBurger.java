
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    
    public CustomBurger ()
    {

    }
    
    public CustomBurger(String d)
    {
        super(d) ;
        price = 5.59;
    }
        
  
    
    public void printDescription(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        String displayString = description;
        if (price > 0)
            displayString = displayString + " " + String.valueOf(price);  
            
        System.out.println( displayString ) ;
        
        strategy.displayOrder(this);
        
    }

 
}

       