package testio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zx on 2015/7/1.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src\\testio\\FileInputStreamTest.java");
            FileOutputStream fos =new FileOutputStream("newfile.txt");
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(bbuf)) >0) {
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
