package patterns;


public class StrategyPattern {

    public static void main(String[] args) {
    
    Computation<Integer> currentStrategy = new IntSum();
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = new IntDifference();
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = new IntProduct();
    System.out.println(currentStrategy.compute(10, 4));
      
    }
  }