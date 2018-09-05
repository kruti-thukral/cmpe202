

public class Main {

    public static void main(String[] args) {
        System.out.println("In Main");
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        gumballMachine = new HalfDollarGumballmachine(5);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        
        gumballMachine = new MixedGumballMachine(5);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 10 );
        gumballMachine.insertQuarter( 5 );
        gumballMachine.insertQuarter( 10 );
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 1 );
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
    }
}
