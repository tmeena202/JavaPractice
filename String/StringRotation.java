package String;

import java.util.Scanner;

public class StringRotation {

    public static class RotationUsingTempString{
        // --->
        public static void lRTempString(String str, int d){
            int n = str.length();

            if(d >= n){
                d = d % n;
            }
            String s1 = str.substring(0,d);
            String s2 = str.substring(d,n);
            String s3 = s2+s1;
            System.out.println(s3);
        }

        // Return type String ---> l.r. of string using temporary string
        public static String lRTempString2(String str, int d){
            int n = str.length();
            if(d >= n){
                d = d % n;
            }
            return str.substring(d) + str.substring(0,d);

        }

        // right rotation2 with using left rotation2
        public static String rRTempString2(String str, int d){
            int l = str.length();
            return lRTempString2(str,l-d);
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String string = "GeeksforGeeks";

        //obj of Outer Class
        StringRotation oc = new StringRotation();

        // if inner class was not static than,
        // StringRotation.RotationUsingTempString ic = oc.new RotationUsingTempString();

        //Obj of Inner Class, but we don't need inner class obj because it is static.
        StringRotation.RotationUsingTempString ic = new RotationUsingTempString();

        // we are not using obj to get access to innerclass method,
        // we are directly using innerclass Name.
        RotationUsingTempString.lRTempString(string, 4); // Not using print, because return type is Void.

        System.out.println(RotationUsingTempString.lRTempString2(string,4)); // using print because rt is String.
        System.out.println(RotationUsingTempString.rRTempString2(string,4));
    }
}
