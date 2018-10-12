   
import java.text.DecimalFormat;

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected double price ;
    protected Strategy strategy;
    public void changeStrategy (Strategy s){
        strategy = s;
    }
    
    public Composite ()
    {
       description = "Order Details";
    }
    
    public Composite ( String d )
    {
        description = d ;
        
    }
    

    public void printDescription() {

        if (price > 0)
            description = description + " " + String.valueOf(price);

        System.out.println( description );

        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public double getPrice() {
        double totalPrice = price;
        DecimalFormat fmt = new DecimalFormat("0.00");
        
          
        for (Component obj  : components)
        {
            totalPrice += obj.getPrice();
            
        }
        
        return totalPrice;
        
    }
   

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void remove(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
     public String getCategory() {
        return null;
    }
     
    public String getDescription(){
        return description;
    }
}
 
