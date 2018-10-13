  
import java.text.DecimalFormat;

public class Five_Guys {

    public static void main(String[] args)
    {
        
        
        Composite order = new Composite() ;
        
        CustomBurger customBurger = new Burger() ;
        
        DecimalFormat price = new DecimalFormat("0.00");
        order.addChild( customBurger );
        customBurger.addChild( new Lettuce() ) ;
        customBurger.addChild( new Tomato() ) ;
        customBurger.addChild( new GrilledOnion() ) ;
        customBurger.addChild( new GrilledJalapeno() ) ;
        order.addChild( new Fries() ) ;
        Strategy s = new CustomerReceipt();
        customBurger.changeStrategy(s);
        System.out.println("Customer Receipt\n");
        order.printDescription();
        Double totalPrice = order.getPrice();
        System.out.println("\nTotal Cost: "+ price.format(totalPrice));
        
        Strategy ps = new PackingSlip();
        customBurger.changeStrategy(ps);
        System.out.println("\nPacking Slip");
        order.printDescription();
        
       
        
        


    }
}
 
