
/**
 * Below class is a state for a gumball machine when the required amount has been inserted
 *
 * @Kruti Thukral
 */
import java.util.Random;

public class HasRequiredAmountState implements State {
    GumballMachine gumballMachine;
 
    public HasRequiredAmountState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        System.out.println("You can't insert another coin");
    }
 
    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.reset();
        gumballMachine.setState(gumballMachine.getNoRequiredAmountState());
        
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "Waiting for turn of crank";
    }
}
