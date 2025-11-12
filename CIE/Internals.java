package pkg.CIE;

public class Internals{
    public int[] internalMarks = new int[5];

    public void SetInternalMarks(int[] marks){
        for(int i=0; i<5; i++){
            internalMarks[i] = marks[i];
        }
    }

    public void displayInternals(){
        System.out.println("Internal Marks:");
        for(int i=0; i<5; i++){
            System.out.println(internalMarks[i]);
        }
        System.out.println();
    }
}
