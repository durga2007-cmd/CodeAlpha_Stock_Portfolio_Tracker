import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Portfolio portfolio = new Portfolio(50000);

        while (true) {

            System.out.println("\n===== STOCK PORTFOLIO TRACKER =====");
            System.out.println("1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. Show Portfolio");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Stock Name: ");
                    String buyName = sc.next();

                    System.out.print("Enter Stock Price: ");
                    double buyPrice = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int buyQty = sc.nextInt();

                    Stock buyStock = new Stock(buyName, buyPrice);

                    portfolio.buyStock(buyStock, buyQty);
                    break;

                case 2:

                    System.out.print("Enter Stock Name: ");
                    String sellName = sc.next();

                    System.out.print("Enter Stock Price: ");
                    double sellPrice = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    Stock sellStock = new Stock(sellName, sellPrice);

                    portfolio.sellStock(sellStock, sellQty);
                    break;

                case 3:

                    portfolio.showPortfolio();
                    break;

                case 4:

                    portfolio.showBalance();
                    break;

                case 5:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}