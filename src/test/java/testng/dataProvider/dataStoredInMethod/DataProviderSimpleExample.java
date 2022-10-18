package testng.dataProvider.dataStoredInMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimpleExample {
    @Test(dataProvider = "getData")
    public void doLogin(String userName, String password) {
        System.out.println(userName + " - " + password);
    }

    @DataProvider(parallel = true) //to run tests in parallel but not one after another
    public Object[][] getData() {

        return new Object[][]{
                {"1Martin@gmail.com", "pass1"},
                {"2Anna@gmail.com", "pass2"},
                {"3Tomr@gmail.com", "pass3"},
                {"4Lui@gmail.com", "pass4"},
                {"5Luka@gmail.com", "pass5"},
                {"6Mila@gmail.com", "pass6"},
        };
    }
}
