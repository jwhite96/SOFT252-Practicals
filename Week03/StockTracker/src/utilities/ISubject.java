package utilities;

/**
 * An interface to make a class a "subject which can be observed"
 * @author jwhite12
 */

public interface ISubject {
    Boolean registerObserver(IObserver o);
    Boolean removeObserver(IObserver o);
    void notifyObservers();
}