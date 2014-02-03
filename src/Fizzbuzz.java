public class Fizzbuzz {
    public String convert(int number) {
        if (isBuzz(number) && isFizz(number))
            return "fizzbuzz";

        if (isBuzz(number))
            return "buzz";

        if (isFizz(number))
            return "fizz";

        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
