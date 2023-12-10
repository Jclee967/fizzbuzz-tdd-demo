import org.example.FizzBuzzConvertor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzConvertorTest{

    private FizzBuzzConvertor fizzBuzzConvertor;
    @BeforeEach
    public void setup(){
        fizzBuzzConvertor = new FizzBuzzConvertor();
    }

    @Test
    public void shouldPrintNumbers_whenGivenNumbersNotThreeFiveMultiples(){
        Assertions.assertEquals("1",fizzBuzzConvertor.convert(1));
        Assertions.assertEquals("2",fizzBuzzConvertor.convert(2));
        Assertions.assertEquals("4",fizzBuzzConvertor.convert(4));
    }

    @Test
    public void shouldPrintFizzBuzz_whenGivenThreeFiveMultiples(){
        Assertions.assertEquals("FizzBuzz",fizzBuzzConvertor.convert(15));
        Assertions.assertEquals("FizzBuzz",fizzBuzzConvertor.convert(30));
        Assertions.assertEquals("FizzBuzz",fizzBuzzConvertor.convert(45));

    }

    @Test
    public void shouldPrintFizz_whenGivenThreeMultiples(){
        Assertions.assertEquals("Fizz",fizzBuzzConvertor.convert(3));
        Assertions.assertEquals("Fizz",fizzBuzzConvertor.convert(6));
    }

    @Test
    public void shouldPrintBuzz_whenGivenFiveMultiples(){
        Assertions.assertEquals("Buzz", fizzBuzzConvertor.convert(5));
        Assertions.assertEquals("Buzz", fizzBuzzConvertor.convert(10));
    }
}