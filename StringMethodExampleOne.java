
public class StringMethodExampleOne {
    public static void main(String[] args) {
        
      
        String s1="Indore";
        String s2="indore";
        int n=s1.compareToIgnoreCase(s2);
        System.out.println(n);
        
        
        /*String s1="yahoo.in";
        boolean b=s1.endsWith(".com");
        System.out.println(b);
        */
        /*String s1=new String("indore");
        String s2=new String("indore");
        
        boolean b=s1.equals(s2);
        System.out.println(b);
        
        boolean b1=s1.equalsIgnoreCase(s2);
        System.out.println(b1);
        
        String s3="indore";
        boolean b2=s3.startsWith("indo");
        System.out.println(b2);
        */
    }
}

/*

    String (non-static method)
     
    1) boolean equals(String) Case sensitive method.
    
    2) boolean equalsIgnoreCase(String) case insensitive method.

    3) boolean startWith(String)   checkthe begining of the string.

    4) boolean endWith(String)      checks the ending charactors.

    5) int compareTo(String)
            int n=s1.compareTo(s2);
            s1>s2 calling object is greater then returns   +ve.

            s1<s2 calling object is smaller then returns   -ve.

            s1=s2                                           0.

    6) int compareToIgnoreCase(String)


*/