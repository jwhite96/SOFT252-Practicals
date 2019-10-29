package stocktracker.stockdatamodel;

public class ServiceStockItem extends StockItem {
      
    public ServiceStockItem(){
        super();
    }
    
    public ServiceStockItem(String name){
        super(name);
    }
    
    public ServiceStockItem(String name, Integer qty){
        super(name, 0);
    }   
    
    @Override
    public StockType getItemType(){
        return StockType.SERVICEITEM;
    }
}
