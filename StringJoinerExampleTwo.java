
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerExampleTwo {
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        StringJoiner sj=new StringJoiner(",");
        
        for(int i=0; i<=5; i++){
            System.out.println("Enter the 5 Students Names : "+i);
            String s=sc.next();
            sj.add(s);
        }
        System.out.println(sj);
    } 
}
