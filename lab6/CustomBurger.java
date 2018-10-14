
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
        
        strategy.displayOrder(this);
        
    }

 
}

       