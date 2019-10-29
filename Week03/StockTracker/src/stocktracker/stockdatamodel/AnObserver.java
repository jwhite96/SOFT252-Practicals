package stocktracker.stockdatamodel;
import utilities.IObserver;

public class AnObserver implements IObserver {
    
    @Override
    public void update(){
        System.out.println("State Change Detected");
    }
}
