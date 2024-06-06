package String;

import java.util.Arrays;

public class StringToStringArray {
    public static void main(String[] args) {
//        String str = "hello my name is tushar";
//        String[] s = str.split(" ");
//        System.out.println(Arrays.toString(s));
//
        String str1 = "/home/user//name";
        String[] s1 = str1.split("/");
        System.out.println(Arrays.toString(s1));

        String str2 = "Hello my name is tushar";
        String[] strings = new String[]{str2};
        System.out.println(Arrays.toString(strings));
    }
}
