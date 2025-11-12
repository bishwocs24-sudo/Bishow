import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int numPages;

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of Pages: " + numPages);
    }
}

public class lab3prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = input.nextInt();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            System.out.print("Price: ");
            double price = input.nextDouble();

            System.out.print("Number of Pages: ");
            int numPages = input.nextInt();
 
            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\n***** All Book Details *****");
        for (int i = 0; i < n; i++) {
            books[i].displayDetails();
            System.out.println("---------------------------");
        }

        input.close();
    }
}
