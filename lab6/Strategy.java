
/**
 * Write a description of interface Strategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Strategy
{
   
    void displayOrder(Composite c);
    void displayOrder(Leaf c);
    void displayPrice(Composite c) ;
}
