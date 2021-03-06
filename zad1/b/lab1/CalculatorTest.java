package lab1;

import lab1.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	double epsilon=0.1;
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void AddTest(){
        Assert.assertEquals(5.0,calculator.add(4.0,1.0),epsilon);
    }

    @Test
    public void SubTest(){
        Assert.assertEquals(18.0,calculator.sub(20.0, 2.0),epsilon);
    }

    @Test
    public void multiTest(){
        Assert.assertEquals(24.0,calculator.multi(6.0,4.0),epsilon);
    }

    @Test
    public void divTest(){
        Assert.assertEquals(4,calculator.div(20.0,5.0),epsilon);
    }

    @Test
    public void greaterTest(){
        Assert.assertTrue(calculator.greater(12.0,5.0));
    }


}

