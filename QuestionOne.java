
import java.util.Scanner;


public class QuestionOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String s1=sc.next();
        boolean b1=s1.endsWith(".jpg");
        if(b1==true){
            System.out.println("image file..");
        }
        System.out.println("Enter the file name : ");
        String s2=sc.next();
        boolean b2=s2.endsWith(".docx");
        if(b2==true){
            System.out.println("word file..");
        }
        System.out.println("Enter the file name : ");
        String s3=sc.next();
        boolean b3=s3.endsWith(".xlsx");
        if(b3==true){
            System.out.println("excel file..");
        }
        
        
        
    }
    
}
