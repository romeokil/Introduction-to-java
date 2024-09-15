public class Casting_04 {
    public static void main(String[] args){
        System.out.println("In this lesson we will learn about casting!!!!!");
        // yha pe higher datatype(double) usme lower datatype ko add kr rhe hai
        // toh koi dikkat ni ho rha hai or ye implicit conversion kr de rha hai.
        double initialprice1=10.0;
        double finalprice1=initialprice1+ 18;
        System.out.println(finalprice1);

        //yha pe lower datatype me hmlog higher datatype ko add kr rhe hai 
        // toh error aa rha tha 

        // int initialprice2=11;
        // int finalprice2=initialprice2+18.0;

        //es error ko hatane ke liye hmlog explicit type conversion kr skte hai.
        int initialprice2=11;
        int finalprice2=initialprice2+(int)18.0;
        System.out.println(finalprice2);

    }
}
