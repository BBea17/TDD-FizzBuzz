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
    @Test
    void testTres(){
        //arrange
        FizzBuzz test3 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test3.FizzBuzz(3);
        expect = "Fizz";
        //Asserts
        assertEquals(expect,sol);
    }
    @Test
    void testCuatro(){
        //arrange
        FizzBuzz test4 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test4.FizzBuzz(4);
        expect = "4";
        //Asserts
        assertEquals(expect,sol);
    }

    @Test
    void testCinco(){
        //arrange
        FizzBuzz test5 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test5.FizzBuzz(5);
        expect = "Buzz";
        //Asserts
        assertEquals(expect,sol);
    }

    @Test
    void testSeis(){
        //arrange
        FizzBuzz test6 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test6.FizzBuzz(6);
        expect = "Fizz";
        //Asserts
        assertEquals(expect,sol);
    }

    @Test
    void testSiete(){
        //arrange
        FizzBuzz test7 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test7.FizzBuzz(7);
        expect = "7";
        //Asserts
        assertEquals(expect,sol);
    }
    @Test
    void testOcho(){
        //arrange
        FizzBuzz test8 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test8.FizzBuzz(8);
        expect = "8";
        //Asserts
        assertEquals(expect,sol);
    }
    @Test
    void testNueve(){
        //arrange
        FizzBuzz test9 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test9.FizzBuzz(9);
        expect = "Fizz";
        //Asserts
        assertEquals(expect,sol);
    }
    @Test
    void testDiez(){
        //arrange
        FizzBuzz test10 = new FizzBuzz();
        String sol, expect;
        //act
        sol = test10.FizzBuzz(10);
        expect = "Buzz";
        //Asserts
        assertEquals(expect,sol);
    }
}