
import java.util.Scanner;


public class UserAuth {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Userid : ");
        String id=sc.next();
        System.out.println("Enter Password : ");
        String pw=sc.next();
        
        if(id.equalsIgnoreCase("ssiuser")){
            if(pw.equalsIgnoreCase("ssiindore")){
                System.out.println("Welcome User..");
            }else{
                System.out.println("Invailed Password..");
            }
        }else{
            System.out.println("Invailed Userid..");
        }
        
    }
}
