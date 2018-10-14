  


public class Five_Guys {

    public static void main(String[] args)
    {
        
        
        Composite order = new Composite() ;
        
        CustomBurger customBurger = new Little_Bacon_Burger() ;
        
        order.addChild( customBurger );
        customBurger.addChild( new Lettuce() ) ;
        customBurger.addChild( new Tomato() ) ;
        customBurger.addChild( new GrilledOnion() ) ;
        customBurger.addChild( new GrilledJalapeno() ) ;
        order.addChild( new Fries() ) ;
        Strategy s = new CustomerReceipt();
        customBurger.changeStrategy(s);
        System.out.println("Customer Receipt");
        order.printReceipt();
       
        
        Strategy ps = new PackingSlip();
        customBurger.changeStrategy(ps);
        System.out.println("Packing Slip");
        order.printReceipt();
       
        
        


    }
}
 
