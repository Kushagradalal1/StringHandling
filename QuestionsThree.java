
public class QuestionsThree {
    public static void main(String[] args) {    
        String s1="this is java and java is powerful and java is object oriented";
        String s2="java";
        for(int i=0; i<s1.length(); i++){
            boolean b=s1.startsWith(s2);
            System.out.println(b);
        }
        
        
    }
    
}
