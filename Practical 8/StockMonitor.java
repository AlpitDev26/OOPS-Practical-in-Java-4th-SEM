class Stock {

    private double price;

    // Synchronized method to update stock price
    synchronized void setPrice(double price) {
        this.price = price;
        System.out.println("Fetched New Stock Price: " + price);
    }

    // Synchronized method to display stock price
    synchronized void getPrice() {
        System.out.println("Current Stock Price: " + price);
    }
}

// Thread to fetch stock prices
class FetchThread extends Thread {

    Stock stock;

    FetchThread(Stock stock) {
        this.stock = stock;
    }

    public void run() {

        try {

            // Simulating API delay
            for (int i = 1; i <= 5; i++) {

                double newPrice = 100 + Math.random() * 50;

                stock.setPrice(newPrice);

                Thread.sleep(2000); // 2 seconds delay
            }

        } catch (InterruptedException e) {
            System.out.println("Fetch Thread Interrupted");
        }
    }
}

// Thread to display stock prices
class DisplayThread extends Thread {

    Stock stock;

    DisplayThread(Stock stock) {
        this.stock = stock;
    }

    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                stock.getPrice();

                Thread.sleep(2000); // 2 seconds delay
            }

        } catch (InterruptedException e) {
            System.out.println("Display Thread Interrupted");
        }
    }
}

public class StockMonitor {

    public static void main(String[] args) {

        Stock stock = new Stock();

        // Create threads
        FetchThread t1 = new FetchThread(stock);
        DisplayThread t2 = new DisplayThread(stock);

        // Start threads
        t1.start();
        t2.start();

        try {

            // Wait for both threads to complete
            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Stock Monitoring Completed.");
    }
}