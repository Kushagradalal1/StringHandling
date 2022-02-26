public class Exone {

    public static void main(String[] args) {
   
        String str="The Best of both worlds";
        int count=0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) !=' '){
                count++;
            }
        }
        //diplay the count of the String...
        System.out.println("The Total Number Of String is : "+count);

    }
}
