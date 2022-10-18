package javaInfo.serializationAndDeserial.exampleWithArrayOfObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//serialization
public class WriteObject {
    public static void main(String[] args) {
        Person[] persons = {new Person(1, "Bob"), new Person(2, "Mike")};

        try (FileOutputStream fileOutputStream = new FileOutputStream("people.bin"); //write data to a file
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) { //convert object to bites

            objectOutputStream.writeObject(persons);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
