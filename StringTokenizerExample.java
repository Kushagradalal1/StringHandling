
import java.util.StringTokenizer;

public class StringTokenizerExample {
   public static void main(String[] args) {

        String s="java,python,php;dotnet,linux";
        
            //to create the tokens of the above String, we will used StringTokenizer
        /*StringTokenizer st=new StringTokenizer(s);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        */
        StringTokenizer st=new StringTokenizer(s,",;o");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
   }
}
/*
    StringTokenizer(String)     //by deafult tokens are created on the basic of spaces.

    0) StringTokenizer(String , String) //Constructors we can also pass multiple delimeters.
    1) String nextToken()
    2) boolean hasMoreToken()  // to check weather is there any more token exsist or not
    3) countToken()         //tokens to read.

*/