package stocktracker.stockdatamodel;

public class PhysicalStockItem extends StockItem {
    
    public PhysicalStockItem(String name){
        this.name = name;
    }
    
    public PhysicalStockItem(String name, Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }
}
