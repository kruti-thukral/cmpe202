 
/**
 * Computation interface
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Computation<T>
{
    /**
     * Compute method which would be overridden by all the classes 
     * which implement this interface
     *
     * @param  n first parameter for the method
     * @param  y second parameter for the method
     * @return   the result produced by the method
     */
    public T compute(T n, T m);
}
