package testio;

import java.io.File;
import java.io.IOException;

/**
 * Created by zx on 2015/6/23.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());

        File tmpFile = File.createTempFile("aaa", "txt", file);
        tmpFile.deleteOnExit();

        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile object exist ?: " + newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();

        String[] filelist = file.list();
        System.out.println("==========================");
        for (String fileName: filelist) {
            System.out.println(fileName);
        }
        System.out.println("==========================");
        File[] roots = File.listRoots();
        for (File root: roots){
            System.out.println(root);
        }
    }
}
