 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    protected Double price ;
    protected String category;
    protected int count;

    
    public Leaf (String d) 
    {
        description = d ;
        price = 0.0 ;
        category = "Item";
        count = 0;
    }
    
    public void changeStrategy (Strategy s){
        //
    }
    
    public void printDescription() {
       

        if (price > 0 && count == 0){
            description = description + " " + String.valueOf(price); 
            count =1;
        }
        else{
            description = description;
            count = 0;
        }
        System.out.println( description ) ;
    
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

    public String getDescription(){
        return description;
    }
     
}
 
