import java.util.Scanner;

class Stock {
    String symbol;
    String company;
    double price;

    public Stock(String symbol, String company, double price) {
        this.symbol = symbol;
        this.company = company;
        this.price = price;
    }
}

public class TradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock s1 = new Stock("TCS", "Tata Consultancy Services", 3500);
        Stock s2 = new Stock("INFY", "Infosys", 1500);
        Stock s3 = new Stock("RELIANCE", "Reliance Industries", 2800);

        double balance = 100000;

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Stocks");
                    System.out.println(s1.symbol + " - " + s1.company + " - ₹" + s1.price);
                    System.out.println(s2.symbol + " - " + s2.company + " - ₹" + s2.price);
                    System.out.println(s3.symbol + " - " + s3.company + " - ₹" + s3.price);
                    break;

                case 2:

                    System.out.print("Enter Stock Symbol (TCS/INFY/RELIANCE): ");
                    String symbol = sc.next().toUpperCase();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Stock selectedStock = null;

                    if (symbol.equals("TCS")) {
                        selectedStock = s1;
                    } else if (symbol.equals("INFY")) {
                        selectedStock = s2;
                    } else if (symbol.equals("RELIANCE")) {
                        selectedStock = s3;
                    } else {
                        System.out.println("Invalid Stock Symbol!");
                        break;
                    }

                    double total = selectedStock.price * qty;

                    if (balance >= total) {
                        balance -= total;

                        System.out.println("\nStock Purchased Successfully!");
                        System.out.println("Stock : " + selectedStock.symbol);
                        System.out.println("Company : " + selectedStock.company);
                        System.out.println("Quantity : " + qty);
                        System.out.println("Total Cost : RS " + total);
                        System.out.println("Remaining Balance : RS " + balance);

                    } else {
                        System.out.println("Insufficient Balance!");
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
