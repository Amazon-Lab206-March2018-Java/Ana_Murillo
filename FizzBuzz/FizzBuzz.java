import java.lang.String;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String Fizz = "Fizz";
        String FizzBuzz = "FizzBuzz";
        String Buzz = "Buzz";

        if (number % 3 == 0 && number % 5 == 0) {
            return FizzBuzz;
        } else if (number % 3 == 0) {
            return Fizz;
        } else if (number % 5 == 0) {
            return Buzz;
        } else {
            return String.valueOf(number);
        }

    }
}
