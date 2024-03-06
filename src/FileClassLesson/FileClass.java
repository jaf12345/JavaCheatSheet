package FileClassLesson;

import java.io.File;

public class FileClass {
    public static void ehh (String [] arr) {
        // file = an abtract representation of file and directory pathnames
        File file = new File("FileClassLesson/secerte_message.txt");

        if(file.exists()) {
            System.out.println("That file exsists !0");
            System.out.println(file.getPath()); // this will get the full path
            file.getPath();
            file.getAbsoluteFile();
            file.isFile();
            file.delete();
        }
        else {
            System.out.println("That file doesnt exsist");
        }
    }
}
