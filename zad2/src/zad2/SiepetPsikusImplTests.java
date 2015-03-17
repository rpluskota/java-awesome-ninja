package zad2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SiepetPsikusImplTests {
Psikus tested = new SiepetPsikusImpl();
@Test
public void cyfrokrad() {
assertEquals(null, tested.cyfrokrad(5));
assertEquals(null, tested.cyfrokrad(-5));
assertEquals(null, tested.cyfrokrad(0));
assertThat(tested.cyfrokrad(11), is(1));
assertThat(tested.cyfrokrad(95), either(is(5)).or(is(9)));
assertThat(tested.cyfrokrad(-95), either(is(-5)).or(is(-9)));
assertThat(tested.cyfrokrad(824), either(is(82)).or(is(24)).or(is(84)));
assertThat(tested.cyfrokrad(-824), either(is(-82)).or(is(-24)).or(is(-84)));
}
@Test(expected = NieudanyPsikusException.class)
public void hultajchochlaException() throws NieudanyPsikusException{
	tested.hultajchochla(5);
	tested.hultajchochla(0);
	tested.hultajchochla(-5);
	
}
@Test
public void hultajchochlaTest() throws NieudanyPsikusException{
assertEquals((Integer)11111, tested.hultajchochla(11111));
assertThat(tested.hultajchochla(12), is(21));
assertThat(tested.hultajchochla(-12), is(-21));
assertThat(tested.hultajchochla(123), either(is(213)).or(is(132)).or(is(321)));
assertThat(tested.hultajchochla(-123), either(is(-213)).or(is(-132)).or(is(-321)));
}
@Test
public void nieksztaltekTest(){
assertEquals((Integer)5, tested.nieksztaltek(5));
assertEquals((Integer)8, tested.nieksztaltek(3));
assertEquals((Integer)1, tested.nieksztaltek(7));
assertEquals((Integer)9, tested.nieksztaltek(6));
assertEquals((Integer)(-5), tested.nieksztaltek(-5));
assertEquals((Integer)(-8), tested.nieksztaltek(-3));
assertEquals((Integer)(-1), tested.nieksztaltek(-7));
assertEquals((Integer)(-9), tested.nieksztaltek(-6));
assertEquals((Integer)(-9), tested.nieksztaltek(-9));
assertThat(tested.nieksztaltek(53), is(58));
assertThat(tested.nieksztaltek(637), either(is(687)).or(is(937)).or(is(631)));
}
}