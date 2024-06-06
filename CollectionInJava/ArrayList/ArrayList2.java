package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayList2 {
    int v ;

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] =1;
        a[1] =1;
        a[2] =1;


        ArrayList al = new ArrayList();
        List al2 = new ArrayList();

        al.add(10);
        al.add("car");
        al.add(10.10);


        al2.add(0,10);
        al2.add(1,20.2);
        al2.add(2,"tushar");


        System.out.println(al.get(2));

    }
}
