package stocktracker;
import stocktracker.stockdatamodel.*; //include all classes from this package

public class StockTracker {

    public static void main(String[] args) {
        //Create a Physical Stock Item object and a Service Stock Item object
        PhysicalStockItem objPhysicalItem = 
                new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 100);
        ServiceStockItem objVirtualItem =
                new ServiceStockItem("Wintersmith: A Diskworld book by Terry Pratchett");
        
        //Test the behaviour of the Physical Stock Item
        String strMessage = objPhysicalItem.getName()
                + ", Is in stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        //Test the behaviour of the Service Stock Item
        strMessage = objVirtualItem.getName()
                + ", Is in stock = " + objVirtualItem.isInStock()
                + ", Qty in stock = " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
}
