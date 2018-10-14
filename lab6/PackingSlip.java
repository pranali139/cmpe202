

public class PackingSlip implements Strategy
{
 
    public PackingSlip()
    {
        
    }
    
    public void displayOrder(Composite c){
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("TB"))
                obj.printOrder();
            
        }
        
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("OM")) {
              
                System.out.println( "->|" + obj.getOrder() ) ;
            }
        }
        
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("BB")){ 
                System.out.println( "{{{{" + obj.getOrder() + "}}}}" ) ;
            }
            
        }
    }
    
   
    
    
}
