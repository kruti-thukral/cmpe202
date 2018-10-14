 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    protected Double price ;
    protected String category;
    protected Strategy strategy;
    
    public Leaf (String d) 
    {
        description = d ;
        price = 0.0 ;
        category = "Item";
    }
    
    public void changeStrategy (Strategy s){
        strategy = s;
    }
    
    public void printDescription() {
       
        
        String displayString = description;
        if (price > 0)
            displayString = displayString + " " + String.valueOf(price);  
            
        System.out.println( displayString ) ;
    
}
    
    public double getPrice() {
        return price;
      }

    public void addChild(Component c) {
        // no implementation
    }

    public void remove(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String s){
        category = s;
    }

    public String getDescription(){
        return description;
    }
     
}
 
