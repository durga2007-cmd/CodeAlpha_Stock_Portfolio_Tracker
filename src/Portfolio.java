import java.util.ArrayList;

public class Portfolio {

    double balance;
    ArrayList<Holding> holding;

    Portfolio(double balance) {
        this.balance = balance;
        holding = new ArrayList<>();
    }

    public void buyStock(Stock stock, int quantity) {

        double cost = stock.getStockPrice() * quantity;

        if (balance >= cost) {

            balance -= cost;

            Holding h = new Holding(stock, quantity);
            holding.add(h);

            System.out.println("Stock Purchased Successfully!");

        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void sellStock(Stock stock, int quantity) {

        boolean found = false;

        for (Holding h : holding) {

            if (h.getStock().getStockName().equals(stock.getStockName())) {

                found = true;

                if (h.getQuantity() >= quantity) {

                    h.removeQuantity(quantity);

                    balance += stock.getStockPrice() * quantity;

                    System.out.println("Stock Sold Successfully!");

                } else {

                    System.out.println("Not Enough Shares!");
                }

                return;
            }
        }

        if (!found) {
            System.out.println("Stock Not Found!");
        }
    }

    public void showPortfolio() {

        if (holding.isEmpty()) {

            System.out.println("Portfolio is Empty.");
            return;
        }

        for (Holding h : holding) {
            System.out.println(h);
            System.out.println("---------------------");
        }
    }

    public void showBalance() {

        System.out.println("Current Balance : ₹" + balance);
    }
}