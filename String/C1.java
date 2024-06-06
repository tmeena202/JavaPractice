package String;


import java.util.Arrays;

public class C1 {

    public static void main(String[] args) {
        int a = 10;
        int b;
        b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");
        a = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");

        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;

        int[] d = c;

        System.out.println(Arrays.toString(c) + c);
        System.out.println(Arrays.toString(d) + d);

        System.out.println(" ");

        c[0] = 10;
        System.out.println(Arrays.toString(c) + c);
        System.out.println(Arrays.toString(d) + d);

        String s = "TM";
        s = "mm";
        String j = "mm";
        System.out.println(s + " " + s.hashCode());
        System.out.println(s + " " + s.hashCode());
        System.out.println(j + " " +s.hashCode());


        String s1 = new String("table");
        String s2 = new String("table");
        String s3 = new String("Wifi");

        System.out.println(s1 + " " + s1.hashCode());
        System.out.println(s2 + " " + s2.hashCode());

        System.out.println(s1.equals(s2)); // gives true because it only checks value
        System.out.println(s1 == s2);  //gives false because checks if reference variable is pointing to same object

        System.out.println(s3 + " " + s3.hashCode());
    }
}
