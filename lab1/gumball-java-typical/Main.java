

public class Main {

    public static void main(String[] args) {
        System.out.println("In Main");
        // base class refernece points to derived class of type QuarterGumballMachine
        GumballMachine gumballMachine = new QuarterGumballMachine(5);

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        
        // base class refernece points to derived class of type HalfDollarGumballMachineAcceptsQuarters
        gumballMachine = new HalfDollarGumballMachineAcceptsQuarters(5);
        System.out.println(gumballMachine);
        // two inserts coins with 25 have to be made for a half dollar machine 
        //which accepts quarters and then the crank is turned
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); // gumball should be ejected
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); // gumball should be ejected
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); // NO gumball should be ejected
        System.out.println(gumballMachine);
        
        // base class refernece points to derived class of type HalfDollarGumballMachineAcceptsMixedCoins
        gumballMachine = new HalfDollarGumballMachineAcceptsMixedCoins(5);
        System.out.println(gumballMachine);
        // multiple insertcoins have to be made for a half dollar machine 
        //which accepts mixed coins and then the crank is turned
        gumballMachine.insertCoin( 25 );
        
        gumballMachine.insertCoin( 10 );
        
        gumballMachine.insertCoin( 5 );
        
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 1 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
