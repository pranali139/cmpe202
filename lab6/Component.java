  

public interface Component {

     void printOrder() ;
     double getPrice() ;
     Component getChild(int i);
     void addChild(Component c);
     void remove(Component c);
     void changeStrategy(Strategy s);
     public String getCategory();
     public String getOrder();
    
    
     
}
 
