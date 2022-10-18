package javaInfo.lambdasExample;

interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable e) {
        int x = e.execute(10);
        System.out.println(x);
    }
}

public class LambdaReturnExample {
    public static void main(String[] args) {
        Runner runner = new Runner();
        //return with parameters
        //brackets need only when we have some parameters: runner.run((x, t, u) -> x + 55);
        runner.run(x -> x + 55);

        //return after some logic
        runner.run((int x) -> {
            int y = x + 7;
            return y;
        });
    }
}
