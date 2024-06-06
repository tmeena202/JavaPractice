package CollectionInJava.Stack;

import java.util.Stack;

public class DisplayStack {
    public static void displayRec(Stack<Integer> st){
        if( st.size() == 0 ) return;
        int top = st.pop();
        System.out.print(top +  " ");
        displayRec(st);
        st.push(top);
    }
    public static void displayStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        //
        while( st.size() > 0 ){
            int x = st.pop();
            temp.push(x);
        }
        while ( temp.size() > 0 ){
            int y = temp.pop();
            System.out.print( y + " " );
            st.push(y);
        }
        System.out.println();
    }
    public static void displayStackUsingArray(Stack<Integer> st){
        int s = st.size();
        int[] ar = new int[5];
        for( int i =st.size()-1; i>=0 ; i-- ){
            int x = st.pop();
            ar[i] = x;
        }
        for ( int i =0; i< s ; i++){
            System.out.print(ar[i] + " ");

        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //

        displayRec(st);
    }
}
