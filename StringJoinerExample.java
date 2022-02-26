
import java.util.StringJoiner;


public class StringJoinerExample {
    public static void main(String[] args) {
        String s1="indore",s2="delhi",s3="mumbai";
        //output as - indore#delhi#mumbai.
        
        StringJoiner joiner=new StringJoiner("&&","{","}");
        joiner.add(s1); joiner.add(s2); joiner.add(s3);
        
        System.out.println(joiner);
    }
    
}
/*

    Constructor is there with three parameters
    ------------------------------------------
                                             joiner,prefix,suffix   
        StringJoiner joiner=new StringJoiner("&&","{","}");
    was introduced in version 8.

*/