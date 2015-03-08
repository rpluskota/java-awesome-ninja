package lab1;

import lab1.LiczbaRzymska;
import org.junit.Assert;
import org.junit.Test;

public class LiczbaRzymskaTest {
	
	@Test
    public void toStringTest(){
        Assert.assertEquals(new LiczbaRzymska(1234).toString(),"MCCXXXIV");
        Assert.assertEquals(new LiczbaRzymska(123).toString(),"CXXIII");
        Assert.assertEquals(new LiczbaRzymska(3).toString(),"III");
    }
	
	@Test(expected = ArithmeticException.class)
	public void constructorTest() throws ArithmeticException{
	new LiczbaRzymska(0);
	new LiczbaRzymska(-5);
	}
}
