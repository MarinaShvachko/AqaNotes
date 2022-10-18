package javaInfo.serializationAndDeserial.exampleWithArrayOfObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;

//deserialization
public class ReadObject {
    public static void main(String[] args) {
        Person[] people=null;

        try (FileInputStream inputStream = new FileInputStream("people.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            people = (Person[]) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        System.out.println(Arrays.toString(people));
    }
}
