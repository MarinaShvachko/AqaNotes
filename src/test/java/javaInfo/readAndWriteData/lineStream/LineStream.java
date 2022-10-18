package javaInfo.readAndWriteData.lineStream;

import java.io.*;

public class LineStream {
    public static void main(String[] args) {
        String pathReadFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToRead.txt";
        String pathWriteFile = "D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\readAndWriteData\\primitiveByteStream\\fileToWrite.txt";
        String data; //a line of text from the file

        try (BufferedReader reader = new BufferedReader(new FileReader(pathReadFile));
             PrintWriter printWriter = new PrintWriter(new FileWriter(pathWriteFile))){
            while ((data = reader.readLine()) != null) {
                printWriter.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
