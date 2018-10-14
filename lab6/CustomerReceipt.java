
import java.text.DecimalFormat;
/**
 * Write a description of class CustomerReceipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerReceipt implements Strategy
{
 

    /**
     * Constructor for objects of class CustomerReceipt
     */
    public CustomerReceipt()
    {
        
    }

    
    
    public void displayOrder(Leaf c){
        String displayString = c.getDescription();
        if (c.getPrice() > 0)
            displayString = "1 " + displayString + " " + String.valueOf(c.getPrice());  
            
        System.out.println( displayString ) ;

    }
    public void displayPrice(Composite c) {
        DecimalFormat fmt = new DecimalFormat("0.00");
         Double totalPrice = c.getPrice();
       System.out.println("\n   Sub.Total: "+ fmt.format(totalPrice));
    }
    public void displayOrder(Composite c){
        DecimalFormat fmt = new DecimalFormat("0.00");
        String displayString = c.getDescription();
        if (c.getPrice() > 0)
            displayString = "1 " + displayString + " " + String.valueOf(c.getPrice());  
            
        System.out.println( displayString ) ;

        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("TB"))
                obj.printDescription();
            else if (placement.equals("OM")){
                System.out.println( "->|" + obj.getDescription() ) ;
            }
            else if (placement.equals("BB")){
                System.out.println( "{{{{" + obj.getDescription() + "}}}}" ) ;
            }
            
            
        }
    }
}
