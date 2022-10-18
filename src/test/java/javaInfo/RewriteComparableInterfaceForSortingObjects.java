package javaInfo;

import java.util.*;

public class RewriteComparableInterfaceForSortingObjects {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addPeople(peopleList);
        addPeople(peopleSet);

        Collections.sort(peopleList);
      //  Collections.sort(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    public static void addPeople(Collection collection) {
        collection.add(new Person(3, "Katy"));
        collection.add(new Person(1, "Mary"));
        collection.add(new Person(4, "Tommy"));
        collection.add(new Person(2, "Saly"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //if we want compare by id, it is applied automatically to treeSet
    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}