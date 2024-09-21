package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    private File file;

    public FileReadWrite() {
        try{
            file = new File("History.txt");
            file.createNewFile();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void writeInFile(String textToWrite) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(textToWrite);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readFromFile() {
        String textFromFile;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((textFromFile = reader.readLine()) != null) {
                System.out.println(textFromFile);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
