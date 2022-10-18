package javaInfo.serializationAndDeserial.exampleWithArrayOfObjects;

public class Cat {
    String color;

    public Cat(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("White");
        Cat cat2 = cat1;

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

    }
}
