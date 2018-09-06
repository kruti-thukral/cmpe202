
/**
 * Below class is a state for a gumball machine when the crank is turned and the gumball is about to be dispensed
 *
 * @Kruti Thukral
 */
public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin(int coin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning crank doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		gumballMachine.reset();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoRequiredAmountState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "Dispensing a gumball";
	}
}


