public class Fizzbuzz {
    public String convert(int number) {
        if (isFizz(number))
            return "fizz";

        return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
