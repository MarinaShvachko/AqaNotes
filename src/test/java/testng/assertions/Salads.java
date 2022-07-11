package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Salads {

    //Hard assert
    @Test(priority = 2)
    public void chickenSalad() {
        Assert.assertEquals("Chicken salad", "Tomato salad", "Error - salads are different!");
        //because of hard assertion code in a line 13 won't be executed
        System.out.println("I'm the code that won't be executed");
    }

    //Soft assert
    @Test(priority = 1)
    public void tomatoSalad() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Chicken salad", "Tomato salad", "Error - salads are different!");
        //because of soft assert code in a line 21 will be executed
        System.out.println("Tomato salad is ready");
        //assertAll() shows if there were assertion errors, without it we won't see any mistakes
        softAssert.assertAll();
    }
}
