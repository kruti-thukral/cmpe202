 
 
import java.util.*;

public class StrategyPattern {

    public static void main(String[] args) {
    
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

