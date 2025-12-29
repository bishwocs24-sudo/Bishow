import java.util.Scanner;
class Book{
    String name;
    String author;
    double price;
    int num_pages;
    public Book(String n, String a, double p,int no){
        name=n;
        author=a;
        price=p;
        num_pages=no;
    }
    public void setdetails(String n1,String a1,double p1,int no1){
        name=n1;
        author=a1;
        price=p1;
        num_pages=no1;
    }
    public void getdetails(){
        System.out.println("Name of Book"+name);
        System.out.println("Author of the book"+author);
        System.out.println("price"+price);
        System.out.println("number of pages"+num_pages);
    }
    public String toString() {
        return "Book Details:\n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price + "\n" +
               "Number of Pages: " + num_pages + "\n";
    }
       public static class demo {
        public static void main(String arr[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the name of the book: ");
            String name = sc.nextLine();

            System.out.print("Enter the author of the book: ");
            String author = sc.nextLine();

            System.out.print("Enter the price of the book: ");
            double price = sc.nextDouble();

            System.out.print("Enter the number of pages: ");
            int num_pages = sc.nextInt();

            Book B1 = new Book(name, author, price, num_pages);

            System.out.println("\n--- Using getdetails() method ---");
            B1.getdetails();

            System.out.println("\n--- Using toString() method ---");
            System.out.println(B1.toString());

            sc.close();
        }
    }
}        

