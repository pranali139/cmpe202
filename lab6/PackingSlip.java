

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
