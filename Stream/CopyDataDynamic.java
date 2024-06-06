package Stream;

//import org.jetbrains.annotations.NotNull;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataDynamic {
    public static void main(String @NotNull [] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
