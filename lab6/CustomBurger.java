
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
        
  
    
    public void printDescription(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        if (price > 0 && count == 0)
            {description = description + " " + String.valueOf(price);  
             count = 1;}
            else{
                description = description + " ";
                count = 0;
            }
            
        System.out.println( description ) ;
        
        strategy.displayOrder(this);
        
    }

 
}

       