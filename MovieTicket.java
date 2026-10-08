import java.util.Scanner;

class MovieTicket {
    String movieName;
    double price;
    int tickets;

    MovieTicket(String name, double p, int t) {
        movieName = name;
        price = p;
        tickets = t;
    }

    void display() {
        double total = price * tickets;
        double discount = 0;

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("\n--- Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        MovieTicket m = new MovieTicket(name, price, tickets);
        m.display();
    }
}