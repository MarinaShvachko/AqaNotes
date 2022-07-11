package testng.dataDrivenTesting.passParametersViaTestngXmlFile;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DrinksWithParameters {

    @Parameters("typeOfCola")
    @Test
    public void cola(String typeOfCola) {
        System.out.println("Cola " + typeOfCola + " is ready");
    }

    @Parameters({"typeOfTea", "amountOfSugar"})
    @Test
    public void tea(String typeOfTea, String amountOfSugar) {
        System.out.println(typeOfTea + " tea with " + amountOfSugar + " of sugar is ready");
    }
}
