package example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeGroups("group1")
    public void setupGroup() {
        System.out.println("Setup");
    }

    @AfterGroups("group1")
    public void teardownGroup() {
        System.out.println("Teardown");
    }

    @Test(groups = "group1")
    public void testGroupOneMethodOne() {
        System.out.println("Test group1 method1");
    }

    @Test(groups = "group1")
    public void testGroupOneMethodTwo() {
        System.out.println("Test group1 method 2");
    }

    @Test(groups = "group2")
    public void testGroupTwoMethodTwo() {
        System.out.println("Test group2 method 1");
    }

    @Test(groups = "group2", enabled = false)
    public void testExclude() {
        System.out.println("Test excluded from execution");
    }
}
