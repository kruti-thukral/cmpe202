
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

    
    
    
    
    public void displayOrder(Composite c){
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