package javaInfo.serializationAndDeserial.exampleWithObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//deserialization
public class ReadObject {
    public static void main(String[] args) {
        Person person1=null;
        Person person2=null;

        try (FileInputStream inputStream = new FileInputStream("people.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            person1 = (Person) objectInputStream.readObject();
            person2 = (Person) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        System.out.println(person1);
        System.out.println(person2);
    }
}
