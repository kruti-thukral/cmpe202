package patterns;


/**
 * Write a description of class IntProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class IntProduct implements Computation<Integer> {

  @Override
  public Integer compute(Integer n, Integer m) {
    System.out.println("Computing product:" + n + "*" + m);
    return n * m;
  }
}