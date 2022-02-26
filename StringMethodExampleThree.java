public class StringMethodExampleThree {
    public static void main(String[] args) {

        String s1="indore#madhyapradesh";
        
       /* char ch=s1.charAt(6);
        System.out.println(ch);
        
        char c[]=s1.toCharArray();
        
        for(char tmp : c){
            System.out.println(tmp);
        }
        */
        
        byte b[]=s1.getBytes();
        
        for(byte tmp : b){
            System.out.println(tmp);
        }
    }
}
/*

        Charactor extraction
        
        1) char charAt(int);  //Oppsite to indexOf Method.
        2) char[] tocharArray()
        3) byte[] getBytes()
*/
