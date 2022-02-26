public class StringMethodExampleTwo {
    public static void main(String[] args) {

        String s="this is java and java is object oriented programming";
        int idx=s.indexOf("java");
        System.out.println(idx);
        int idx1=s.indexOf("java", 9);
        System.out.println(idx1);
        /*String s="this is java and java is object oriented programming";
        int idx=s.indexOf('z');
        System.out.println(idx);
        int idx1=s.indexOf('i',10);
        System.out.println(idx1);
        */
    } 
}
/*
    Searching anything in a String.

    1) int indexOf(char)    //Searching starts from starting.

       if we are searching and that element is not present then returns -1    
    2) int indexOf(char , int)
      eg int indexOf('i',10); // In this case the searching will be starts from idx 10

    3) int indexOf(String)  // In this case we are searching for a particular String.

    4) int indexOf(String , int) //In this Case the Searching will be Start from idx 9.

    
    
*/