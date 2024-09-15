public class Datatypes_01 {
    public static void main(String[] args) {
        //data types
        //premitive and non-premetive
        //premitive
        //int-4,float-4,byte-2,boolean-2,long-8,double-8,char-1;
        // int age=300000000;
        // byte no=20;
        // float price=45622.0807F;
        // long sum=900000000L;
        // boolean isAdult=true;
        // char letter='a';
        // System.out.println("int type "+age);
        // System.out.println("byte type "+no);
        // System.out.println("float type "+price);
        // System.out.println("long type "+sum);
        // System.out.println("boolean type "+isAdult);
        // System.out.println("Char type "+letter);

        //non-premetive
        //String,
        //Non premetive datatypes hmlog kuch particular default function 
        //ka access de rha hota hai jiske wajah se hmlogo string me opertion perform kr skte hai.
        //Builtin function-length,charAt(index),concat,compareTo
        String name="Rahui";
        String surname="Kumar";
        String name2="Alice";
        String name3="Bob";
        String name4="Rahul Kumar Jha";
        System.out.println("Name "+name);
        System.out.println("size of the string "+name.length());
        System.out.println("Substring "+name.substring(0,3));
        System.out.println("Concat String "+ name.concat(surname));
        System.out.println("Comparing the string "+name.compareTo(surname));
        System.out.println("Comparing the string "+name2.compareTo(name3));
        int n=name.length();
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
        }
        System.out.println("Extracting Kuamr from string name4 "+name4.substring(6,11));
        
    }
}
