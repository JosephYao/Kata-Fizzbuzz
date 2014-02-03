import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzbuzz {

    Fizzbuzz convertor = new Fizzbuzz();

    @Test
    public void non_fizzbuzz_number_should_return_itself() {
        assertEquals("1", convertor.convert(1));
        assertEquals("2", convertor.convert(2));
    }

    @Test
    public void multiply_of_3_should_return_fizz() {
        assertEquals("fizz", convertor.convert(3));
        assertEquals("fizz", convertor.convert(6));
    }

    @Test
    public void multiply_of_5_should_return_buzz() {
        assertEquals("buzz", convertor.convert(5));
        assertEquals("buzz", convertor.convert(10));
    }

    @Test
    public void _15_should_return_fizzbuzz() {
        assertEquals("fizzbuzz", convertor.convert(15));
    }
}
