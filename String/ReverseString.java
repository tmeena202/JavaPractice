package String;

import java.util.Stack;

class ReverseString {

    // ---> Reverse a String Using Stack
    public void reverseStringStack(String str, int n){
        char[] cArray = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for ( int i=0; i<n; i++){
            st.push(cArray[i]);
        }
        for(int i=0; i<n; i++){
            char removed = st.pop();
            cArray[i] = removed;
        }
        String arrayToString = String.copyValueOf(cArray);
        System.out.println(arrayToString);

        //here we are calling toString method which is Overridden.
//        System.out.println(toString(cArray));
    }
    // converts CharacterArray to String
     public static String toString(char[] chars){
         String arrayToString = String.valueOf(chars);
        return arrayToString;
    }

    //---> Reverse a string using TwoPointers
    public static void reverseTwoPointers(String str, int n){
        char[] cArray = str.toCharArray();
        int i=0, j=n-1;
        char temp;
        while(i<=j){
            temp = cArray[i];
            cArray[i] = cArray[j];
            cArray[j] = temp;
            i++;
            j--;
        }
        String arrayToChar = String.copyValueOf(cArray);
        System.out.println(arrayToChar);
    }

    // ---> reverse String Using Recursion [My Version]
    public static void reverseRecursion(String str, int i, int n){
        char[] c = str.toCharArray();
        int j = n-1;
        char[] ans = swap(c, i, j,n);
        String arrayToString = String.copyValueOf(ans);
        System.out.println(arrayToString);
    }
    public static char[] swap(char[] c, int i, int j, int n){
        if(i == n/2)
            return c;
        char temp;
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        char[] ans = swap(c,i+1,j-1,n);
        return ans;
    }

    // ---> reverse String Using Recursion
    public static void reverseRecursion2(){
            
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String s = "Tushar Meena";
//        rs.reverseStringStack(s,s.length());
//        reverseTwoPointers(s,s.length());
        reverseRecursion(s,0,s.length());
    }
}
