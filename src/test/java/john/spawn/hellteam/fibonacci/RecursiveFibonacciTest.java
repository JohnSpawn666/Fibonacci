package john.spawn.hellteam.fibonacci;

import org.junit.jupiter.api.BeforeEach;

class RecursiveFibonacciTest extends AbstractFibonacciTest{

    @BeforeEach
    void setUp(){
        fibonacci = new RecursiveFibonacci();
    }

}