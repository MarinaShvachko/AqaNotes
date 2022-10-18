package javaInfo;

public class Welcome {
    private final String name;

    public Welcome(String name) {
        this.name = name;
    }

    public void call() {
        System.out.printf("Hello %s! \n", name);
    }
}

 class Main {
    public static void main(String[] args) {
        new Welcome("John").call();
        new Welcome("Jane").call();
    }
}
