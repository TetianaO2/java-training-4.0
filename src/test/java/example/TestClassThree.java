package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testLowestPriority() {
        System.out.println("Test with Lowest Priority");
    }

    @Test(priority = 2)
    public void testMediumPriority() {
        System.out.println("Test with Medium Priority");
    }

    @Test(priority = 1)
    public void testHighestPriority() {
        System.out.println("Test with Highest Priority");
    }
}