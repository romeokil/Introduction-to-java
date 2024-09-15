public class Exception_handling_11 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Exception Handling concept");

        // Esme hmlog try and catch block ko sikhaage
        // Use kb krte hai jb bhi hmara reswlt ambigious ho 
        // mtlb ho skta hai ki hmko result mile 
        // ho skta hai ni bhi mile 
        // toh hmlog aisa kr skte hai ki tm try krlo agr mil gy toh thik agr ni mila toh
        // catch block me phek dena jo bhi problem aaega wo ye catch block de lega.


        int [] arr={20,30,40};
        // agr arr ka 5th index access krne ka kosish kre toh wo 
        // out of bound wala exception ho jaega.
        // toh ye ek ambigious operation hai na eslie hmlog aisa krte hai ki
        // aisa statement ko try catch block me daal dete hai.
        // or only try or only catch block exist ni krta hai 
        try{
            System.out.println(arr[2]);
        }
        catch(Exception exception){
            System.out.println("Error "+exception);
        }
        finally{
            System.out.println("Finally block reached!!");
        }
    }

}
