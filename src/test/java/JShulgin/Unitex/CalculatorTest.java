package JShulgin.Unitex;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();


    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3,1), 0.00001);
        assertEquals(50, calc.add(40,10), 0.00001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(25, calc.sub(60,35), 0.00001);
    }

    @Test
    public void mul() throws Exception {

        assertEquals(36, calc.mul(6,6), 0.00001);
    }

    @Test
    public void div() throws Exception {

        assertEquals(9, calc.div(72,8), 0.00001);
    }
    //@Test(expected = ArithmeticException.class)// ssilka na klas (peredajom clas, hochju ispoljzovatj klass arfmetic exception)
    //public void divbyZero() throws Exception {
    //    calc.div(5,0);
    //}
@Test
    public void divByZero() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calc.div(5,0), 0.00001);
}
}