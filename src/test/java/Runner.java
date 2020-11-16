

import org.testng.Assert;

import org.testng.annotations.Test;

public class Runner extends TestBase{


    @Test
    @TestData(testId = "TC13" )
    public void testName() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Helloo";
        Assert.assertEquals(ac,ex);

    }

    @Test
    @TestData(testId = "TC14")
    public void testName1() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Hello";
        Assert.assertEquals(ac,ex);
    }


}
