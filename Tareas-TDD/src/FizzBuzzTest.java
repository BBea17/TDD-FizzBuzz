import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testUno() {
        //arrange
        FizzBuzz test1 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test1.FizzBuzz(1);
        expect = "1";
        //Asserts
        assertEquals(expect,sol);
    }

    @Test
    void testDos(){
        //arrange
        FizzBuzz test2 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test2.FizzBuzz(2);
        expect = "2";
        //Asserts
        assertEquals(expect,sol);
    }

}