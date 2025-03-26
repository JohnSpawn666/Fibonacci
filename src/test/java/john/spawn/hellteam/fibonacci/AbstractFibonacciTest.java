package john.spawn.hellteam.fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

abstract class AbstractFibonacciTest {

    protected IFibonacci fibonacci;

    @ParameterizedTest
    @CsvSource(value = {"0:0", "1:1", "2:1", "3:2", "4:3", "5:5", "6:8", "7:13", "8:21"}, delimiter = ':')
    void calculateIndex0Test(int n, int expected){

        final BigInteger result = fibonacci.calculate(n);

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateNegativeTest(){

        final int n = -1;

        Assertions.assertThatThrownBy(() ->
                fibonacci
                        .calculate(n)).isInstanceOf(IllegalArgumentException.class);
    }




}