package javaInfo.readAndWriteData.bufferedReaderWriter;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String pathReadFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToRead.txt";
        String pathWriteFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToWrite.txt";
        String data;

        try (BufferedReader reader = new BufferedReader(new FileReader(pathReadFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathWriteFile))) {
            while ((data = reader.readLine()) != null) {
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
