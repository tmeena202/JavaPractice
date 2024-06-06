package CollectionInJava.Stack;

import java.util.Stack;

public class ReversalOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> wt = new Stack<>();

        while( st.size() >= 1){
            temp.push(st.pop());
        }
        System.out.println(temp);

        while (temp.size() >= 1){
            wt.push(temp.pop());
        }
        System.out.println(wt);
    }

}
