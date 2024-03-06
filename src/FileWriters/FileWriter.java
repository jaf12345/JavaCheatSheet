package FileWriters;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void ehh (String [] arr) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n");
            writer.append("\n (A poem by bri)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}
