package testio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zx on 2015/7/1.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\testio\\FileInputStreamTest.java");
        byte[] bbuf = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fis.read(bbuf)) > 0) {
            System.out.println(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
