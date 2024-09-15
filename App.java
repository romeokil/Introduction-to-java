import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("This is Rahul Kumar");
        // agr hmko ek word input me lena hai toh hm usko 
        // in.next();
        //lekin agr tmko pura ka pura sentence hi lena hai toh us case  me
        // in.nextLine();
        String name;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=in.next();
        System.out.println(name);
        System.out.println("Enter the full Sentence.");
        String name2=in.nextLine();
        System.out.println(name2);
    }
}
