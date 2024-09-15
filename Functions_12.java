import java.util.*;
public class Functions_12 {
    public static void calculate(int firstno,int secondno,char operator){
        if(operator=='+'){
            int sum=firstno+secondno;
            System.out.println("Sum is "+sum);
        }
        else if(operator=='-'){
            int diff=firstno-secondno;
            System.out.println("Difference is "+diff);
        }
        else if(operator=='*'){
            int mul=firstno*secondno;
            System.out.println("Multiplicaton is "+mul);
        }
        else if(operator=='/'){
            int div=firstno/secondno;
            System.out.println("Division is "+div);
        }
        else{
            int mod=firstno%secondno;
            System.out.println("Modulus is "+mod);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Functions..........");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first no");
        int n1=in.nextInt();
        System.out.println("Enter the second no");
        int n2=in.nextInt();
        in.nextLine();
        System.out.println("Enter the operator(+,-,*,/,%)");
        String ch=in.nextLine();
        char character=ch.charAt(0);

        // calling the function

        calculate(n1,n2,character);
        
    }
}
