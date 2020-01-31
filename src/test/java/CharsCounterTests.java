import lesson1.CharsCounter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CharsCounterTests {

    @DataProvider(name = "CharsCounter")
    public Object[][] testDataCharsCounter(){

        return new Object[][] {
                {"Hello, world!", 'o', 2},
                {"", '1', 0},
                {"111", '1', 3}
        };
    }

    @Test(dataProvider = "CharsCounter")
    public void charsCounterTest(String str, char ch, int expectedResult){
        int actualResult = CharsCounter.getCharsCounter(str, ch);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
