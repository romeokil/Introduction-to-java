import java.util.*;
public class Randomnogame_13 {
    public static void main(String[] args) {
        System.out.println("Welcome to the random no generator game!!");
        int randomno=(int)(Math.random()*100);
        // System.out.println(randomno);
        
        Scanner in=new Scanner(System.in);
        System.out.println("Press -1 to exit");
        while(true){
            System.out.print("Enter Your Number : ");
            int aapkano=in.nextInt();
            if(aapkano == -1){
                System.out.println("Exiting........");
                break;
            }
            else if(aapkano==randomno){
                System.out.println("Woohooo!!!!!!!! You got the no");
                break;
            }
            else if(aapkano>randomno){
                System.out.println("Your no is bada than randomno");
            }
            else{
                System.out.println("Your no is chota than randomno");
            }
        }
        System.out.println("Random no tha "+randomno);
    }
}
