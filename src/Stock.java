public class Stock {
    String stockName;
    double stockPrice;

    Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }


    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }
    @Override
    public String toString(){
        return "Stock Name: "+stockName+
                "\nStock Price: "+stockPrice;
    }
}
