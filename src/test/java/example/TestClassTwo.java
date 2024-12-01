package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters({"parameter1", "parameter2"})
    public void acceptParameterFromXml(String parameter1, String parameter2) {
        System.out.println("Parameters from testng.xml: Parameter1 " + parameter1 + ", Parameter2 " + parameter2);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void acceptParameterFromDataProvider(String parameter1, int parameter2) {
        System.out.println("Parameters from DataProvider: Parameter1 " + parameter1 + ", Parameter2 " + parameter2);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Test1", 5},
                {"Test2", 10},
        };
    }
}