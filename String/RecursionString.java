package String;

public class RecursionString {
    public static void main(String[] args) {
        String str = "bacadddd";
        char ch = 'a';
        //skipCharacter(str, "", ch, 0);
        System.out.println(skipCharacter2(str, ch, 0));
    }

    public static void skipCharacter(String s, String new_string, char ch, int i){

        // b.c
        if(i==s.length()) {
            System.out.println(new_string);
            return;
        }

        // self work
        if(s.charAt(i) != ch)
            new_string = new_string + s.charAt(i);

        skipCharacter(s,new_string,ch, i+1);
    }

    public static String skipCharacter2(String s, char ch, int i){
        //inside function calling
        String str = "";
        // b.c
        if(i==s.length()) {
            return str;
        }

        // self work
        if(s.charAt(i) != ch)
            str = str + s.charAt(i);

        return str + skipCharacter2(s, ch, i+1);
    }
}
