package Stream;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FisDemo {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("test2.txt");
        int data ;
        while((data = fis.read()) != -1){
            System.out.println("data "+ (char)data + " " + data);
        }
        fis.close();
    }
}
class FosDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bbc.txt");
        fos.write(5);
        fos.close();
    }
}

class CopyData {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("Original.txt");
        FileOutputStream fos = new FileOutputStream("Copy.txt");

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}



