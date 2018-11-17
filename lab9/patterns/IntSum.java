package patterns;


class IntSum implements Computation<Integer> {

  @Override
  public Integer compute(Integer n, Integer m) {
    System.out.println("Computing sum:" + n + "+" + m);
    return n + m;
  }

}