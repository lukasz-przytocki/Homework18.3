import org.junit.Assert;
import org.junit.Test;

public class SumSquareDifferenceTest {
    @Test
    public void shouldReturn22() {
        //given
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        //when
        double result = sumSquareDifference.difference(3);
        //then
        Assert.assertEquals(result, 22, 0);
    }

    @Test
    public void shouldReturn2640() {
        //given
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        //when
        double result = sumSquareDifference.difference(10);
        //then
        Assert.assertEquals(result, 2640, 0);
    }

    @Test
    public void shouldReturn25164150() {
        //given
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        //when
        double result = sumSquareDifference.difference(100);
        //then
        Assert.assertEquals(result, 25164150, 0);
    }


}
