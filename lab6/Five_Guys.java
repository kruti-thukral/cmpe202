  
import java.text.DecimalFormat;

public class Five_Guys {

    public static void main(String[] args)
    {
        
        
        Composite order = new Composite() ;
        
        CustomBurger customBurger = new Little_Bacon_Burger() ;
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        order.addChild( customBurger );
        customBurger.addChild( new Lettuce() ) ;
        customBurger.addChild( new Tomato() ) ;
        customBurger.addChild( new GrilledOnion() ) ;
        customBurger.addChild( new GrilledJalapeno() ) ;
        order.addChild( new Fries() ) ;
        Strategy s = new CustomerReceipt();
        customBurger.changeStrategy(s);
        System.out.println("Print Customer Receipt");
        order.printDescription();
        Double totalPrice = order.getPrice();
        System.out.println("\n   Sub.Total: "+ fmt.format(totalPrice));
        
        Strategy ps = new PackingSlip();
        customBurger.changeStrategy(ps);
        System.out.println("Print Packing Slip");
        order.printDescription();
        totalPrice = order.getPrice();
        System.out.println("\n   Sub.Total: "+ fmt.format(totalPrice));
       
        
        


    }
}
 
