

public class GumballMachine {
 
    State soldOutState;
    State noCoinsState;
    State hasCoinsState;
    State soldState;
    State hasPartialCoinsState;
    State state = soldOutState;
    int sum = 0;
    String machine;
    int price;
    int count = 0;
 
    public GumballMachine(int numberGumballs, String machine1, int price1) {
        soldOutState = new SoldOutState(this);
        noCoinsState = new NoCoinsState(this);
        hasCoinsState = new HasCoinsState(this);
        hasPartialCoinsState = new HasPartialCoinsState(this);
        soldState = new SoldState(this);
        this.machine = machine1;
        this.price = price1;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinsState;
        } 
    }
 
    public void insertCoins(int coin) {
        state.insertCoins(coin );
    }
 
    public void ejectCoins() {
        state.ejectCoins();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinsState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinsState() {
        return noCoinsState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }
    
    public State getHasPartialCoinsState() {
        return hasPartialCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
