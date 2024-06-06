package String;

import java.util.Arrays;
import java.lang.Object.*;

import static java.lang.ProcessHandle.current;

public class StringExample {
    public static void main(String[] args) {
        char[] c = new char[5];
        c[0] = 't';
        c[1] = 'm';
        c[2] = 't';
        c[3] = 'm';
        c[4] = 't';

        String s = "Hello";
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(c);
        String s4 = new String(c,0,1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

class String2 {
    public static void main(String[] args) {
        char[] c = new char[15];
        String s = "Hello there";

        System.out.println(s.charAt(4));
        s.getChars(0, 11, c,0);
        System.out.println(Arrays.toString(c));
    }
}
class StringComparing {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("hello");
        String s2 = new String("goodbye");
        String s3 = new String("happy birthday");
        String s6 = s3;
        String s4 = new String("happy birthday");
        String s7 = new String("Happy birthday");
        String s5 = s1;

//        System.out.println(s1.equals("hello"));
//        System.out.println(s3.equals(s4));
//        System.out.println(s1 == s5);
//        System.out.println(s3 == s6);
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println(s1 == s);
//        System.out.println(s4.equalsIgnoreCase(s7));
    }
}
class StringBuilder1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello there I am TM");
        StringBuilder sb1 = new StringBuilder("My name is Tm");
        char[] c = new char[10];

//        System.out.println(sb.toString());
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());
//
//        sb.ensureCapacity(100);
//        System.out.println(sb.capacity());
//        System.out.println(sb.charAt(10));
//        sb.getChars(0,10,c,0);
//        for (char ch: c) {
//            System.out.print(ch);
//        }
//        System.out.println();
//        sb.setCharAt(0,'h');
//        System.out.println(sb.toString());
//        System.out.println(sb.reverse());


//        String string1 = "hello";
//        String string2 = "BC";
//        int value = 22;
//        String s = string1 + string2 + value;
//        String s = new StringBuilder().append( "hello" ).append( "BC" ).
//                append( 22 ).toString();
//        System.out.println(s.toString());


    }
}