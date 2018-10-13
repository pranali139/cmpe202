import java.text.DecimalFormat;

public class Burger extends CustomBurger
{
 
    public Burger( )
    {
        super("LBB") ;
        price = 5.59;
        addChild(new Bacon());
        
        
    }
  
}
