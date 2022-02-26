
import java.util.Scanner;


public class MailCheck {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mail Id : ");
        String mail=sc.next();
        
        int idx=mail.indexOf('@');
        
        if(idx==-1){
            System.out.println("Not a vaild Id @ must be there..");
        }else{
            System.out.println("Its an Vaild Id..");
        }
    }
}
