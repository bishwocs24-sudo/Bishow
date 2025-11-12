import java.util.Scanner;

 class Employee{
     String EmplName;
     String EmpID;
     double Marks[];
     int hourlyRate;       
     int hoursWorked;       
    void acceptDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        EmplName = input.nextLine();
        System.out.print("Enter ID: ");
        EmpID = input.nextLine();
        System.out.print("Enter hourlyRate: ");
        hourlyRate=input.nextInt();
        System.out.print("Enter hoursWorked: ");
        hoursWorked=input.nextInt();

        input.close();
    }
    void displayDetails(){

        System.out.println("***Student Details***");
        System.out.print("Name: " +EmplName);
        System.out.println("ID: "+EmpID);
        System.out.println("hoursWorked: "+hoursWorked);
        System.out.println("hourlyRate: "+hourlyRate);
        System.out.println("Total Salary: "+Salary());
    }

        double Salary(){
            return  hoursWorked*hourlyRate ;
    }
}    

public class lab2prog2{
    public static void main(String[] args) {
        Employee e = new Employee ();
        e.acceptDetails();
        e.displayDetails();
    }
 }

