import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {
    @Test
    public void testEmpty(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("");
        //Asserts
        assertEquals("0",vacio.suma(""));
    }
    @Test
    public void testUno(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("1");
        //Asserts
        assertEquals("1",vacio.suma("1"));
    }
    @Test
    public void testTres(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("1,2");
        //Asserts
        assertEquals("3",vacio.suma("1,2"));
    }
    @Test
    public void testCuatro(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("1,1,2");
        //Asserts
        assertEquals("4",vacio.suma("1,1,2"));
    }
    @Test
    public void testSeparador(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("1,2,");
        //Asserts
        assertEquals("-1",vacio.suma("1,2,"));
    }

    @Test
    public void testNegativo(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("1,2,-2");
        //Asserts
        assertEquals("-1 numero negativo",vacio.suma("1,2,-2"));
    }
    @Test
    public void testMayorMil(){
        //Arrange
        Operaciones vacio = new Operaciones();
        //act
        vacio.suma("5,1002");
        //Asserts
        assertEquals("numero superior a 1000 ignorado", vacio.suma("5,1002"));
    }
}