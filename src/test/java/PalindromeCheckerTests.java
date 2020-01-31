import lesson1.PalindromeChecker;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeCheckerTests {

    @DataProvider(name = "PalindromeCheckerTest")
    public Object[][] testDataFactorial(){

        return new Object[][] {
                {"madam", true},
                {"apple", false},
                {"Madam", false}
        };
    }

    @Test(dataProvider = "PalindromeCheckerTest")
    public void doPalindromeCheckTest(String str, boolean expectedResult){
        boolean actualResult = PalindromeChecker.getPalindromeCheck(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
