

import java.util.Random;

public class HasCoinsState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoins(int coin) {
        if(this.gumballMachine.sum >= this.gumballMachine.price){
            System.out.println("You can't insert another coins");
        }
    }
 
    public void ejectCoins() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinsState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
