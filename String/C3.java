package String;

public class C3 {

    public static void main(String[] args) {
        String st = "string";
        String st1 = "string";
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());

        //store in String pool which is in heap
        System.out.println( st == st1); // Only one object but two reference Variable

        String st2 = new String("string1");
        String st3 = new String("string1");

        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println( st2 == st3 );

        System.out.println(st.charAt(2));
    }
}
