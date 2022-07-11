package testng.runTestsViaTestngXml;

import org.testng.annotations.Test;

public class Drinks {

    @Test
    public void cola() {
        System.out.println("Cola is ready");
    }

    @Test(groups = "Regress")
    public void tea() {
        System.out.println("Tea is ready");
    }
}
