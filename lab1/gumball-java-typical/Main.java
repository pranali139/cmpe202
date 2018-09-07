

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,"Quarter", 25);
        GumballMachine gumballMachine1 = new GumballMachine(5,"All Coins", 50);
        GumballMachine gumballMachine2 = new GumballMachine(5,"Double Quarter", 50);

        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
	gumballMachine.turnCrank();
	gumballMachine1.insertCoin( 10 );
        gumballMachine1.insertCoin( 10);
        gumballMachine1.insertCoin( 25 );
        gumballMachine1.insertCoin( 5 );
	gumballMachine1.turnCrank();
	 gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
	gumballMachine2.turnCrank();
	gumballMachine.insertCoin( 5 );
	gumballMachine.turnCrank();	
	gumballMachine1.insertCoin( 25 );
	gumballMachine1.turnCrank();	
	gumballMachine2.insertCoin( 10 );
	gumballMachine2.turnCrank();			

        
    }
}
