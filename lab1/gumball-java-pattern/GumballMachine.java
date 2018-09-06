
import java.util.Stack;
abstract class GumballMachine {
 
    State soldOutState;
    State noRequiredAmountState;
    State hasRequiredAmountState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    private int sum = 0; // variable which keeps track of amount inserted 
    //private Stack<Integer> stackOfCoins = new Stack<>(); // will be required if eject coin ejects only the last coin in future, in 
    // which case we would need to keep track of last coin
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noRequiredAmountState = new NoRequiredAmountState(this);
        hasRequiredAmountState = new HasRequiredAmountState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noRequiredAmountState;
        } 
    }
    
    /*abstract functions which are implemented by the derived classes*/
    abstract int getMinAmount();
    abstract boolean validateCoin(int coin);
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
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
        state = noRequiredAmountState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoRequiredAmountState() {
        return noRequiredAmountState;
    }

    public State getHasRequiredAmountState() {
        return hasRequiredAmountState;
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
    
    /* below function is a helper function for incrementing amount inserted in the gumball machine*/
    public void incrementAmount(int amount ) {
        this.sum = this.sum + amount;
    }

    /* getter function to retrieve the amount inserted in the gumball machine*/
    public int getAmountInserted() {
        return sum;
    }

    /* helper function to reset the machine after gumball is ejected*/
    public void reset() {
        sum = 0;
        //stackOfCoins.clear();
    }

    /* function to validate required amount has been insterted for a gumball to be ejected from the machine*/
    public boolean validateAmount() {
        return (getAmountInserted() / getMinAmount() > 0?true:false);
    }
    
    
    //Future implemenation functions
    /*public void setLastCoin(int coin) {
        stackOfCoins.push(coin);
    }
    
    public int getLastCoin() {
        return stackOfCoins.pop();
        
    }
    below function is a helper function for decrementing amount inserted after a gumball is ejected
    public void decrementAmount(int amount ) {
        this.sum = this.sum - amount;
    }*/

}
