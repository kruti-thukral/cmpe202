

public class Main {

    public static void main(String[] args) {
        
        //Testing for QuarterGumballMachine - accepts only quarters and ejects a gumball for every qaurter inserted
        GumballMachine gumballMachine = new QuarterGumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        //Testing for HalfDollarGumballMachine - accepts only quarters and ejects a gumball for every 50 cents inserted
        gumballMachine = new HalfDollarGumballMachineAcceptsQuarters(5);
        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        //Testing for HalfDollarGumballMachine - accepts  quarters/nickels/dimes and ejects a gumball for every 50 cents inserted
        gumballMachine = new HalfDollarGumballMachineAcceptsMixedCoins(3);
        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(5);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(5);
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(5);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(1);
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
    }
}
