public class VowelConsonent {

    public static void main(String[] args) {
   
        //declared a variable for vowel count and for consonenet count.
        
        int vcount=0;
        int ccount=0;
        
        String str="this is a really simple sentance";
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vcount++;
                
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                //counting the consonents..
                ccount++;
                
            }
        }
        System.out.println("Total Number Of Vowels Are : "+vcount);
        System.out.println("Total Number Of Consonents Are : "+ccount);

    }
    
}
