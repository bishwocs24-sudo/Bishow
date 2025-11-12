import java.util.Scanner;

public class lab1prog1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();

        double disc= b*b - 4*a*c;

        if(a==0){
             System.out.println("Not a quadratic equation");
        }
        else if (disc == 0){
            System.out.println("real and equal roots");
            double x = -b/(2*a);
            System.out.println("Roots are" +x +x);
        }
        else if (disc > 0){
            System.out.println("real and unequal roots");
            double x= (-b + Math.sqrt(disc))/(2*a);
            double y= (-b - Math.sqrt(disc))/(2*a);
            System.out.println("Roots are" +x +y);
        }
        else{
            System.out.println("No real solutions");
        }

        input.close();   

    }
}