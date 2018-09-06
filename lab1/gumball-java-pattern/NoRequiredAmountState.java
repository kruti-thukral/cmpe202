/**
 * Below class is a state for a gumball machine when the required amount for the gumball is not inserted
 *
 * @Kruti Thukral
 */

public class NoRequiredAmountState implements State {
    GumballMachine gumballMachine;
 
    public NoRequiredAmountState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        if ( gumballMachine.validateCoin(coin)) {
            gumballMachine.incrementAmount(coin); // Increment amount inserted accordingly
            //gumballMachine.setLastCoin(coin); // Keep track of last coin . Required during ejectCoin()
            System.out.println( "Received " + coin + " cents" ) ;
        }
        else // Notify user when inserted coin is not of accepted type
            System.out.println( "Coin inserted is not of accepted type. Coin Returned" ) ;
        
        
        if (gumballMachine.validateAmount()) // If the required amount is inserted, change state
            gumballMachine.setState(gumballMachine.getHasRequiredAmountState());
    }
 
    public void ejectCoin() {
        if (gumballMachine.getAmountInserted() > 0) {
            System.out.println("Coins returned");
            gumballMachine.reset();
        }
        else
            System.out.println("You haven't inserted a coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but you have inserted:" + gumballMachine.getAmountInserted() + " whereas amount required:" + gumballMachine.getMinAmount() );
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "Waiting for coin";
    }
}
