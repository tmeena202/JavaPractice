package CollectionInJava.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
        public Boolean isBalanced(String s){
            Stack<Character> st = new Stack<>();
            ArrayList<Character> ar = new ArrayList<>();
            int l = s.length();
            char[] c = new char[l];

            for( int i = 0; i<= s.length()-1; i++){
                c[i] = s.charAt(i);
                if (c[i] == '('){
                    st.push('(');
                }
                else {  //c[i] == ')'
                    if( st.size() == 0 ) return false;
                    if( st.peek() == '(') st.pop();
                }
            }
            if (st.size() > 0) return false;
            else return true;
        }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            Bracket br = new Bracket();
            System.out.println(br.isBalanced(s));
    }
}
