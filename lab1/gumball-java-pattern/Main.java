

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,"Double Quarter", 50);

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();

		

		gumballMachine.insertCoins(10);
		gumballMachine.turnCrank();
		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		
		

		System.out.println(gumballMachine);
	}
}
