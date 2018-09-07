
public class GumballMachine
{

    private int num_gumballs;
    private int price;
    private boolean has_quarter;
    private String machine;
    private int sum;
    private boolean has_coins;

    public GumballMachine( int size , String machine1, int price1)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.machine = machine1;
        this.price = price1;
        this.has_coins = false;
        this.sum = 0;
    }

    public void insertCoin(int coin)
    {
        if (coin == 25){
            this.sum += coin;
            this.has_coins = true;
        }
        else if(machine.equals("All Coins")){
             this.sum += coin;
             this.has_coins = true;
        }
        else
             System.out.println("Eject Coin. Only Quarter Accepted");
    }
           
    public void turnCrank()
    {
        if (this.sum >= this.price )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_coins = false;
                this.sum -= this.price;
                System.out.println( "Thanks for your payment.  Gumball Ejected from " + this.machine + "machine!" ) ;
                if(this.sum >= this.price)
                {
                    this.has_coins = true;
                    turnCrank();
                }
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else{
            System.out.println("Insert more coins.");
        }
        
        
    }
}
