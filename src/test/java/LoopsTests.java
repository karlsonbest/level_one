import lesson1.Factorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class LoopsTests {
    @DataProvider(name = "factorial")
    public Object[][] testDataFactorial(){

        return new Object[][] {
                {1, 5, Arrays.asList(1, 2, 3, 4, 5)},
                {5, 1, Arrays.asList(5, 4, 3, 2, 1)},
                {1, 1, Arrays.asList(1)}
        };
    }

    @Test(dataProvider = "factorial")
    public void factorialTest(int first, int last, List<Integer> expectedResult){
        List<Integer> actualResult = Factorial.getFactorialList(first, last);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
