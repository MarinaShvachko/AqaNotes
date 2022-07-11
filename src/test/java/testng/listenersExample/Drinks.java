package testng.listenersExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Drinks {

    @Test
    public void cola() {
        System.out.println("Cola is ready");
    }

    @Test
    public void tea() {
        Assert.assertEquals("Cat", "Dog", "Cat and dog can not be equals");
        System.out.println("Tea is ready");
    }
}
