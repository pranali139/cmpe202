 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String order ;
    protected Double price ;
    protected String category;
    protected int count;

    
    public Leaf (String d) 
    {
        order = d ;
        price = 0.0 ;
        category = "Item";
        count = 0;
    }
    
    public void changeStrategy (Strategy s){
        //
    }
    
    public void printOrder() {
       

        if (price > 0 && count == 0){
            order = order + " " + String.valueOf(price); 
            count =1;
        }
        else{
            order = order;
            count = 0;
        }
        System.out.println( order ) ;
    
}
    
    public double getPrice() {
        return price;
      }

    public void addChild(Component c) {
        // no implementation
    }

    public void remove(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String s){
        category = s;
    }

    public String getOrder(){
        return order;
    }
     
}
 
