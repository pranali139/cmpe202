public class HasPartialCoinsState implements State {
    GumballMachine gumballMachine;
 
    public HasPartialCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoins(int coin) {
        System.out.println("You inserted $" + coin);
        if (coin != 25 && this.gumballMachine.machine != "All Coins"){
            
            System.out.println("Only Quarters Accepted");
        }
        
        else
        {
             
            this.gumballMachine.sum += coin;
            
            if (this.gumballMachine.sum >=this.gumballMachine.price){
                gumballMachine.setState(gumballMachine.getHasCoinsState());
        }
            else
            { 
                  
                gumballMachine.setState(gumballMachine.getHasPartialCoinsState());
            }   
        
        
        }    
        
        
    }
 
    public void ejectCoins() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinsState());
        
    }
 
    public void turnCrank() {
        System.out.println("Insert more coins to get gumball");
        
     }
 
    public void dispense() {
         System.out.println("Insert more coins to complete payment");
    } 
 
    public String toString() {
        return "waiting for more coins to be inserted";
    }
}