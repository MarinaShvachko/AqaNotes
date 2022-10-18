package javaInfo.equalsAndHashCode;

public class RewriteEquals {
    public static void main(String[] args) {
        Animal cat1 = new Animal("White");
        Animal cat2 = new Animal("White");

        System.out.println(cat1.equals(cat2));
    }
}

class Animal {
    String color;

    public Animal(String color) {
        this.color = color;
    }

    //if I want compare animals by color
    @Override
    public boolean equals(Object o) {
        Animal otherAnimal = (Animal) o;
        return this.color == otherAnimal.color;
    }
}
