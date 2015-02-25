package lab1;

import lab1.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 25.02.15.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void AddTest(){
        Assert.assertEquals(5,calculator.add(4,1));
    }

    @Test
    public void SubTest(){
        Assert.assertEquals(18,calculator.sub(20, 2));
    }

    @Test
    public void multiTest(){
        Assert.assertEquals(24,calculator.multi(6,4));
    }

    @Test
    public void divTest(){
        Assert.assertEquals(4,calculator.div(20,5));
    }

    @Test
    public void greaterTest(){
        Assert.assertTrue(calculator.greater(12,5));
    }


}
