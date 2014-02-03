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
    public void _3_should_return_fizz() {
        assertEquals("fizz", convertor.convert(3));
    }
}
