package javaInfo.errorsAndExceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\projectsIdea\\AqaNotes\\src\\test\\java\\javaInfo\\errorsAndExceptions\\file.txt"));
            bufferedWriter.write("hello");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (!(bufferedWriter == null)) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
