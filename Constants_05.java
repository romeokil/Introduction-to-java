public class Constants_05 {
    public static void main(String[] args) {
        System.out.println("Starting with Constants............");
        //Bhaiya ji dekho aisa hota ki hmlog kuch values ko constant rkhna chahte hai na
        // toh un saare variables ke aage hmlog final keyword attach kr dete hai
        // jisse compiler ko samajh aa jata hai ki ab eska value change ni hoga
        //and also koi agr usko intentionally change krna bhi chahe toh kr ni skta hai error aa jaega.
        int age=56;
        System.out.println("Without modification "+age);
        age=45;
        System.out.println("With modification "+age);
        final double PI=3.1428;
        System.out.println("Without modification "+PI);
        // PI=4.56;
        //ab hmlog change ni kr skte hai qki final keyword PI me likh diye toh ab usko koi
        //mai ka laal change ni kr skta hai.
    }
}
