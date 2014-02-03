import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzbuzz {

    @Test
    public void _1_should_return_1() {
        Fizzbuzz convertor = new Fizzbuzz();
        String actual = convertor.convert(1);
        assertEquals("1", actual);
    }

}
