package String;

import java.util.Arrays;

public class StringSorting {
    static void sortString1(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String string = s.valueOf(ch);
        System.out.println(string);
    }

    // Sorting using nested loop
    static void sortString2(String str){
        int n = str.length();
        char[] chars = str.toCharArray();
        char temp;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(chars[i] > chars[j]){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        String s = String.copyValueOf(chars);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "zbfwqiopbaa";
        sortString1(str);
        sortString2(str);
    }
}
