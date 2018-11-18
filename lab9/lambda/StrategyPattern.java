 
 
import java.util.*;

public class StrategyPattern {

    public static void main(String[] args) {
    // Lambdas can be used instead of concrete strategy classes
    // Depending on the lambda function currentStrategy points to,
    // appropriate compute method is called
    Computation<Integer> currentStrategy = (n, m)-> { 
      System.out.println("Computing sum:" + n + "+" + m);
      return n+m; 
    };
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = (n, m)-> { 
      System.out.println("Computing difference:" + n + "-" + m);
      return n-m; 
    };
    System.out.println(currentStrategy.compute(10, 4));

    currentStrategy = (n, m)-> { 
      System.out.println("Computing product:" + n + "*" + m);
      return n*m; 
    };
    System.out.println(currentStrategy.compute(10, 4));
      
    }
  }

