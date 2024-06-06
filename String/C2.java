//Different character arrays

package String;
import java.util.Arrays;

public class C2 {

    public static void main(String[] args) {
        char[] ch = new char[3];
        ch[0] = 't';
        ch[1] = 'u';
        ch[2] = 's';

        char[] ch1 = ch;

        System.out.println(ch + Arrays.toString(ch));
        System.out.println(ch1 + Arrays.toString(ch1));

        char[] ch2 = {'t', 'u', 's'};
        System.out.println(ch2 + Arrays.toString(ch2));

        char[] ch3 = {'1','2'};
        System.out.println(ch3 + Arrays.toString(ch3));



    }
}
