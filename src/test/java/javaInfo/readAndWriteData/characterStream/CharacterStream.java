package javaInfo.readAndWriteData.characterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**write characters
 *  The character stream uses the byte stream to perform the physical I/O, while the character stream handles translation between characters and bytes.
 *  FileReader, for example, uses FileInputStream, while FileWriter uses FileOutputStream.
 */

public class CharacterStream {
    public static void main(String[] args) {
        String pathReadFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToRead.txt";
        String pathWriteFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToWrite.txt";
        int data;  // variable holds a character value in its last 16 bits, FileReader reads two bytes at one time

        try (FileReader fileReader = new FileReader(pathReadFile);
            FileWriter fileWriter = new FileWriter(pathWriteFile)) {
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
