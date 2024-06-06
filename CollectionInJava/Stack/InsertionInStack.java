package CollectionInJava.Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter at which place you want to enter : ");
        int n = sc.nextInt();
        System.out.print("Enter the Number : ");
        int m = sc.nextInt();

        Stack<Integer> temp = new Stack<>();
        while(st.size() > n-1){
            temp.push(st.pop());
        }
        st.push(m);
        while( temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
