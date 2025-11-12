package pkg.SEE;

import pkg.CIE.Personal;

public class External extends Personal{
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem){
        super(usn, name, sem);
    }

    public void SetSEEMarks(int[] marks){
        for(int i=0; i<5; i++){
            seeMarks[i] = marks[i];
        }
    }
    public void displaySEE(){
        System.out.println("SEE Marks:");
        for(int i=0; i<5; i++){
            System.out.println(seeMarks[i]);
        }
        System.out.println();
    }
}