
public class StringConstructorExample {
    public static void main(String[] args) {
    
        String s1=new String();
        System.out.println(s1);
        System.out.println(s1.length());
        
        String s2=new String("indore");
        System.out.println(s2);
        
        char ch[]={'a','b','c','d','e','f','g'};
        String s3=new String(ch);
        System.out.println(s3);
        
        String s4=new String(ch,2,5);
        System.out.println(s4);
        
                 //B  C  D  E  F  G  H  I  J  K 
        byte b[]={66,67,68,69,70,71,72,73,74,75};
        String s5=new String(b);
        System.out.println(s5);
        
        String s6=new String(b,2,5);
        System.out.println(s6);
        
    }
}
/*

    1)String()  //Zero args Constructor.
    2)String(String)  
    3)String(char [])
    we have to take some parts in a String Charactor.
    4)String(char [] , int , int)// First int is from where we have to start our indexing 
    Second int is was how many charactors we have to take .
    5)String(byte [])
    6)String(byte [] , int , int)
*/