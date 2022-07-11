package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyOfTests {
    @Test
    public void cola() {
        Assert.assertEquals("Cat", "Dog"); //deliberately fail this method
        System.out.println("Cola is ready");
    }

    @Test(groups = "Regress", dependsOnMethods = "cola") //this method will be ignored because the main method failed
    public void tea() {
        System.out.println("Tea is ready");
    }

    @Test(groups = "Regress", dependsOnMethods = {"cola", "tea"}, alwaysRun = true) //this method will be executed in any case
    public void teaThatWillBeExecuted() {
        System.out.println("Tea is ready");
    }
}
