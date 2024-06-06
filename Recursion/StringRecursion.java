package Recursion;

public class StringRecursion {

    static String ans = ""; // iV
    public static String removeAllCharOcc(String str, char ch, int i){
        //base condition
        if(str.length() == i){
            return ans;
        }
        //sef work
        if(str.charAt(i) != ch)
            ans= ans+str.charAt(i);

        // Sub problem
        return removeAllCharOcc(str, ch,i+1);
    }

    // reverse but we are using string builder
    public static StringBuilder reverseString(String string){
        StringBuilder sb = new StringBuilder(1);
        for(int i=string.length()-1; i>=0; i--){
            char ch = string.charAt(i);
            sb.append(ch);
        }
        return sb;
    }

    //
    public static StringBuilder reverse(String string){
        int i = string.length()-1;
        StringBuilder sb2 = new StringBuilder(1);
        return reverseStringRec(string, i, sb2);
    }
    public static StringBuilder reverseStringRec(String str, int i, StringBuilder sb3){
        if(i == -1)
            return sb3;

        sb3.append(str.charAt(i));
        return reverseStringRec(str, i-1, sb3);
    }

    public static void main(String[] args) {
        String s = "axbxcaxxxxxx";
        char ch = 'x';
//        System.out.println(removeAllCharOcc(s,ch,0));
//        System.out.println(reverseString(s));

        System.out.println(reverse(s));
    }
}
