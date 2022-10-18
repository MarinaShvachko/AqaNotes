package javaInfo.differentClasses.innerClassExample;

public class Car {
    int id;

    public void startCar() {

        String noise = "Low";

        class ClassInsideMethod {
            public void noise() {
                System.out.println("Car with id " + id + " has a noise = " + noise);
            }
        }

        ClassInsideMethod classInsideMethod = new ClassInsideMethod();
        classInsideMethod.noise();
    }
}
