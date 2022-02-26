public class StringBufferExampleTwo {

    public static void main(String[] args) {
   
        String s="Aldrin is a Boy";
        
        //create a StringBuffer object and pass String as a constructor.
        
        StringBuffer s1=new StringBuffer(s);
        s1.reverse();
        System.out.println(s1);

    }
}
