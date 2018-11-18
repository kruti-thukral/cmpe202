 


public class StrategyPattern {

    public static void main(String[] args) {
    
    // Depending on the conncrete strategy class, appropriate 
    // compute method is called
    Computation<Integer> currentStrategy = new IntSum();
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = new IntDifference();
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = new IntProduct();
    System.out.println(currentStrategy.compute(10, 4));
      
    }
  }