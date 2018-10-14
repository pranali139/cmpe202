
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    
    public CustomBurger ()
    {}
    
    public CustomBurger(String d)
    {
        super(d) ;
        price = 5.59;
        count = 0;
    }
        
  
    
    public void printOrder(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        if (price > 0 && count == 0)
            {order = order + " " + String.valueOf(price);  
             count = 1;}
            else{
                order = order + " ";
                count = 0;
            }
            
        System.out.println( order ) ;
        
        strategy.displayOrder(this);
        
    }

 
}

       