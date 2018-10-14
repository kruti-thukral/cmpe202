
/**
 * Write a description of class PackingSlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PackingSlip implements Strategy
{
   

    /**
     * Constructor for objects of class PackingSlip
     */
    public PackingSlip()
    {
        
    }

    public void displayOrder(Leaf c){
        
            
        System.out.println( c.getDescription() ) ;
    }
    
    public void displayOrder(Composite c){
        
            
        System.out.println( c.getDescription() ) ;

        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("TB"))
                obj.printDescription();
            
        }
        
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("OM")) {
                System.out.println( "->|" + obj.getDescription() ) ;
            }
        }
        
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("BB")){
                System.out.println( "{{{{" + obj.getDescription() + "}}}}" ) ;
            }
            
        }
    }
    
   
    
    
}
