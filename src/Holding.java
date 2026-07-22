public class Holding{
    Stock stock;
    int quantity;
    Holding(Stock stock,int quantity){
        this.stock=stock;
        this.quantity=quantity;
    }
    public Stock getStock(){
        return stock;
    }
    public int getQuantity(){
        return quantity;
    }
    public void addQuantity(int quantity){
        this.quantity+=quantity;
    }
    public void removeQuantity(int quantity){
        this.quantity-=quantity;
    }
    @Override
    public String toString(){
        return "Stock Name: "+stock.getStockName()+
                "\nStock Price: "+stock.getStockPrice()+
                "\nQuantity: "+quantity;
    }
}