package testio;

import java.io.File;

/**
 * Created by zx on 2015/6/23.
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] nameList = file.list((dir, name) -> name.endsWith(".java")
                || new File(name).isDirectory());
        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
