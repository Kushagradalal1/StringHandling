public class CountVowels {
    public static void main(String[] args) {

        String s="this is a java code";
        int vowel=0;
        
        //counting vowels.
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
        }
        System.out.println("Total Vowels are : "+vowel);
    }
}
