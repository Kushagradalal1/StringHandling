
import java.util.Scanner;

public class CheckUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mail id : ");
        String id=sc.next();
        System.out.println("Enter the Password : ");
        String pw=sc.next();
        
        if(id.equals("ssiuser")){
            if(pw.equals("ssiindore")){
                System.out.println("Welcome User..");
            }else{
                System.out.println("invaild password..");
            }
        }else{
            System.out.println("Invaild User id..");
        }
    } 
}
