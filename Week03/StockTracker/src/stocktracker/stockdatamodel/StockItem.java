package stocktracker.stockdatamodel;
import utilities.IObserver;
import utilities.ISubject;
/**
* Super class from which specialised stock item classes will inherit
* @author jwhite12
*/

public abstract class StockItem implements ISubject {
    
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000000.00;
    protected Double costPrice = 1000000.00;
    private ArrayList<IObserver> obervers = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }    
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if(quantityInStock != null && quantityInStock >= 0){
            this.quantityInStock = quantityInStock;
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >= 0){
            this.sellingPrice = sellingPrice;
        }
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if(costPrice != null && costPrice >= 0){
            this.costPrice = costPrice;
        }
    }
    
    public Boolean isInStock(){
        Boolean inStock = false;
        if(this.quantityInStock > 0){
            inStock = true;
        }
        return inStock;
    }
    
    public StockItem(){
        
    }
    
    public StockItem(String name){
        this.name = name;
    }
    
    public StockItem(String name, Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }
    
    public abstract StockType getItemType(); 
    
    @Override
    public Boolean registerObserver(IObserver o){        
    }
    
    @Override
    public Boolean removeObserver(IObserver o){                
    }
    
    @Override
    public void notifyObservers(){        
    }
}
