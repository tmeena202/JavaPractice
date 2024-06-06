package CollectionInJava.Stack;

import java.util.Arrays;
import java.util.Stack;

public class RemovalOfSubsequence {
    private static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i< arr.length; i++){
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);

            else if ( arr[i] == st.peek()){
                if ( i == arr.length-1 || arr[i] != arr[i+1] )
                    st.pop();
                else if ( arr[i] == arr[i+1]){
                    // Do nothing
                }
            }
        }
        int[] temp = new int[st.size()];
        int m = temp.length;
        for ( int i = m-1; i >= 0;i-- ){
            temp[i] = st.pop();
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] temp = remove(arr);
        for(int i = 0; i < temp.length ; i++){
            System.out.print(temp[i] + " ");
        }

    }
}
