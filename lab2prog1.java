import java.util.Scanner;

 class Student{
     String Name;
     String USN;
     double Marks[];
     int Credits[];       

    void acceptDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name = input.nextLine();
        System.out.print("Enter USN: ");
        USN = input.nextLine();
        System.out.print("Enter no of subjects: ");
        int n=input.nextInt();
        
        Marks= new double[n];
        Credits= new int[n];

        for(int i=0; i<n;i++){
            System.out.println("Subject "+(i+1));
            System.out.print("Credits: ");
            Credits[i] = input.nextInt();
            System.out.print("Marks: ");
            Marks[i] = input.nextDouble();
        }
        input.close();
    }
    void displayDetails(){

        System.out.println("***Student Details***");
        System.out.println("Name: "+ Name);
        System.out.println("USN: "+USN);
        System.out.println("Subjects: "+ Credits.length);
        for(int i=0; i<Credits.length;i++){
            System.out.println("Subject "+(i+1)+ ": " + " Credits:"+Credits[i] +" Marks: "+Marks[i]);
        }
        System.out.println("SGPA: "+SGPA());
    }

        private double gradePoint(double mark){
            if (mark >= 90) return 10;
            else if (mark >= 80) return 9;
            else if (mark >= 70) return 8;
            else if (mark >= 60) return 7;
            else if (mark >= 50) return 6;
            else if (mark >= 40) return 5;
            else return 0; // Fail
        }
        double SGPA(){
            double totalCredits = 0;
            double weightedSum = 0;
            for (int i = 0; i < Credits.length; i++) {
                double gp = gradePoint(Marks[i]);
                weightedSum += gp * Credits[i];
                totalCredits += Credits[i];
            }
            return (double) weightedSum / totalCredits;
    }
}    

public class lab2prog1{
    public static void main(String[] args) {
        Student s = new Student();
        s.acceptDetails();
        s.displayDetails();
    }
 }
