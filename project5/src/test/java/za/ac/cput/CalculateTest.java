
//This is a simple programme that show few calculations add,mult,div and sub.ss

package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
@Test
    public void add(){
        Calculate calculator = new Calculate();
        Assert.assertEquals(5, calculator.add(2,3));

    }

    @Test
    public void mult(){

        Calculate calculator1 = new Calculate();
        Assert.assertEquals(6, calculator1.mult(2,3));
    }

  @Test
    public void sub(){

        Calculate calculator2 = new Calculate();
        Assert.assertEquals(1, calculator2.sub(3,2));
    }

    @Test
    public void div(){

        Calculate calculator3 = new Calculate();
        Assert.assertEquals(2, calculator3.div(10,5));
    }
}
