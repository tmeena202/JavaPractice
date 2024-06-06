package Stream;

import java.io.File;
import java.io.IOException;

public class ReadByte {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Enter anything ");
        System.in.read(data);

        System.out.println("data you entered :");
        for(int i=0; i< data.length; i++){
            System.out.print((char) data[i]);
            File da;
        }
    }
}
