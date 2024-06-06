package ArrayOperations.UnsortedArray;

public class Deletion {
    static int find(int[] a, int n, int x){
        for(int i =0 ; i<n; i++){
            if (a[i] == x)
                return i;
        }
        return -1;
    }
    static void deletion(int[] a, int n ,int x){
        int position =  find(a, n, x);
        if (position == -1 )
            System.out.println("element not found");

    }

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0]=11;
        a[1]=12;
        a[2]=13;
        a[3]=14;
        a[4]=15;

        int n = 5;
        int capacity = a.length;

        int x = 11;


        deletion(a, n ,x );

    }
}
