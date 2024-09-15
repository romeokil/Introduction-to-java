import java.util.*;
public class Array_03 {
    public static void main(String[] args){
        System.out.println("Starting with Arrays...");
        Scanner in =new Scanner(System.in);
        //2 built in function hai hmare pass 
        //1---->length
        //2----->sort-Arrays.sort(array name)
        // c++ me pehle naaam likhte the phir square braces dete the lekin isme ulta hai.
        // int [] marks=new int[3];
        // ye tb likhte hai jb hmlog ko chizen pehle se pata ni hai 
        // agr pata hota toh direct aisa likh skte the 
        // int [] arr={45,56,34};
        // System.out.println("Enter your marks");
        // for(int i=0;i<3;i++){
        //     marks[i]=in.nextInt();
        // }
        // System.out.println("Without sorting "+marks[0]);
        // Arrays.sort(marks);
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println("With sorting "+marks[0]);

        //Intro to 2-d array
        int [][] studentMarks=new int[3][3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the marks of 3 subjects of Student "+(i+1));
            for(int j=0;j<3;j++){
                studentMarks[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            System.out.println("Displaying the marks of 3 subject of Student "+(i+1));
            for(int j=0;j<3;j++){
                System.out.println(studentMarks[i][j]);
            }
        }
        

    }
}
