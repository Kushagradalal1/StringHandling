public class StringBufferExamples {
    public static void main(String[] args) {
        /*
        StringBuffer sb=new StringBuffer("abcdefgh");
        System.out.println(sb); 
        sb.append("XYZ");
        System.out.println(sb);
        */
        /*
        StringBuffer sb=new StringBuffer("abcdefgh");
        System.out.println(sb);
        sb.insert(3, "XYZ");
        System.out.println(sb);
        */
        
        /*StringBuffer s=new StringBuffer("abcdefgh");
        System.out.println(s); 
        s.replace(0, 5, "XYZ");
        System.out.println(s);
        */
        /*StringBuffer s1=new StringBuffer("abcdefgh");
        System.out.println(s1);
        s1.setCharAt(3, 'Z');
        System.out.println(s1);
        */
        /*
        StringBuffer s2=new StringBuffer("abcdefgh");
        System.out.println(s2);
        s2.deleteCharAt(3);
        System.out.println(s2);
        */
        /*StringBuffer s2=new StringBuffer("abcdefgh");
        System.out.println(s2);
        s2.delete(2, 5);
        System.out.println(s2);
        */
        /*
        StringBuffer s2=new StringBuffer("abcdefgh");
        System.out.println(s2);
        s2.setLength(10);
        System.out.println(s2);
        */
        /*
        StringBuffer s2=new StringBuffer("abcdefgh");
        System.out.println(s2);
        s2.reverse();
        
        System.out.println(s2);
        */
        StringBuffer s2=new StringBuffer("abcdefgh");
        System.out.println(s2);
        String s3=s2.toString();
        String s4=s3.toUpperCase();
        System.out.println(s4);
        
    }    
}
/*
    append =>  adds the contents at the end of exsiting contents.
    insert => can add the contents at the desired position.
    replace =>  can chane the range of the charactor with the new contents.
    setCharAt => can replace a single char.
    deleteCharAt => delect a char from a given index.(Delected Char will not put any spaces.)
    delete => can delete a range of char.
    setlenght => can change the lenght of StringBuffer Object.(we can increase or decrease the lenght).
    reverse => will change the order of the char.
    toString => will covert StringBuffer to String Object.
   

*/