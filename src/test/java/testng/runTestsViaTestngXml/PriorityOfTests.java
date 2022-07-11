package testng.runTestsViaTestngXml;

import org.testng.annotations.Test;

public class PriorityOfTests {

    @Test(groups = {"Regress", "Smoke"}, priority = 1)
    public void chickenSalad() {
        System.out.println("Chicken salad is ready");
    }

    @Test(groups = "Smoke", priority = 0)
    public void tomatoSalad() {
        System.out.println("Tomato salad is ready");
    }

}
