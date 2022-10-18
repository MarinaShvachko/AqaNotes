package javaInfo.readAndWriteData.primitiveByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//not to use, write bytes
public class ByteStream {
    public static void main(String[] args) {
        String pathReadFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToRead.txt";
        String pathWriteFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToWrite.txt";
        int data;  // variable holds a byte value in its last 8 bits

        try (FileInputStream readData = new FileInputStream(pathReadFile);
             FileOutputStream writeData = new FileOutputStream(pathWriteFile)) {
            while ((data = readData.read()) != -1) {
                writeData.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

