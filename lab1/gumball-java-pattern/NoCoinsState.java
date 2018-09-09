

public class NoCoinsState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoins(int coin) {
        System.out.println("You inserted $" + coin);
        if (coin != 25 && this.gumballMachine.machine != "All Coins"){
            
            System.out.println("Only Quarters Accepted");
        }
        
        else if (coin == 25 && this.gumballMachine.machine == "Quarter"){
            
            gumballMachine.setState(gumballMachine.getHasCoinsState());
        }
        else
        {
             
            this.gumballMachine.sum += coin;
            
            gumballMachine.setState(gumballMachine.getHasPartialCoinsState());
        }    
        
        
    }
 
    public void ejectCoins() {
        System.out.println("You haven't inserted any coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coin";
    }
}
