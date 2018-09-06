

public class Main {

    public static void main(String[] args) {
        System.out.println("In Main");
        // base class refernece points to derived class of type QuarterGumballMachine
        GumballMachine gumballMachine = new QuarterGumballMachine(5);

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        
        // base class refernece points to derived class of type HalfDollarGumballMachineAcceptsQuarters
        gumballMachine = new HalfDollarGumballMachineAcceptsQuarters(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(); // NO gumball should be ejected
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(); // gumball should be ejected
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(); // gumball should be ejected
        gumballMachine.turnCrank(); // NO gumball should be ejected
        System.out.println(gumballMachine);
        
        // base class refernece points to derived class of type HalfDollarGumballMachineAcceptsMixedCoins
        gumballMachine = new HalfDollarGumballMachineAcceptsMixedCoins(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 1 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
