package javaInfo.graspPatterns.highCohesion;

/**
* we don't create one "Employee" class with all methods,
 * we create a separated classes with corresponding methods
 * so a class has to have only related data
 */
public class Restaurant {
    Cook cooker;
    Waiter waiter;
    Cleaner cleaner;
}

class Cook {
    public void cookFood() {

    }
}

class Waiter {
    public void serve() {

    }
}

class Cleaner {
    public void clean() {

    }
}
