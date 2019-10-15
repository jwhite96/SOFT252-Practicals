package stocktracker.stockdatamodel;

public class ServiceStockItem extends StockItem {
      
    public ServiceStockItem(String name){
        this.name = name;
    }
    
    public ServiceStockItem(String name, Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }

    @Override
    public Boolean isInStock() {
        return true;
    }   
    
}
