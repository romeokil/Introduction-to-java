public class Loops_10 {
    public static void main(String[] args) {
        System.out.println("Welcome to loops");
        // Types of Loops
        //1.For Loop
        //2.While loop
        //3.Do-while Loop

        //1.For loop
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }
        //2.Using while loop we will do the same work
        int i=0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        //3.Do while loop
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=10);

    // Hmaare pass 2 keywords or hai jo hmlog use krte hei 
    // jb bhi hmlog loops me deal kr rhe hote hai.
    // break,continue;

    while(i<=5){
        if(i==3) {
            i=i+1;
            continue;
        }
        if(i>4) break;
        System.out.println(i);
        i++;
    }


    }
}
