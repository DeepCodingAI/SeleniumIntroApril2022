package check;

import calculation.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void verifyCalculatorAddition(){
        Assert.assertEquals(100, Calculator.addition(50,50));
    }

    @Test
    public void verifyCalculatorSubtraction(){
        Assert.assertEquals(40, Calculator.subtraction(90,50));
    }

}
