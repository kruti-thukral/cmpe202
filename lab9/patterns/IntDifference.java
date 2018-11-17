package patterns;
/**
 * Write a description of class IntDifference here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class IntDifference implements Computation<Integer> {

  @Override
  public Integer compute(Integer n, Integer m) {
        System.out.println("Computing difference:" + n + "-" + m);
        return n - m;
  }
}