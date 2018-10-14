

public class CustomerReceipt implements Strategy
{
    public CustomerReceipt()
    {
        
    }
    
    public void displayOrder(Composite c){
        for (Component obj  : c.components)
        {
            String placement = obj.getCategory();
            if (placement.equals("TB"))
                obj.printOrder();
            else if (placement.equals("OM")){
                System.out.println( "->|" + obj.getOrder() ) ;
            }
            else if (placement.equals("BB")){
                System.out.println( "{{{{" + obj.getOrder() + "}}}}" ) ;
            }
            
            
        }
    }
}
