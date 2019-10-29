package stocktracker;
import stocktracker.stockdatamodel.*; //include all classes from this package

public class StockTracker {

    public static void main(String[] args) {
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("HALO 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        
        //Lets ask each of the three items too print their type to the console
        //Item 1        
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 1 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 1 is a SERVICE stock item");
        }
        //Item 2
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 2 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 2 is a SERVICE stock item");
        }
        //Item 3
        if(objTestItem3.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 3 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 3 is a SERVICE stock item");
        }        
    }
}
