package javaInfo.serializationAndDeserial.exampleWithObject;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    private static final long serialVersionUID = 6529685098267757690L;

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person name=" + name + ". Person id = " + id;
    }
}
