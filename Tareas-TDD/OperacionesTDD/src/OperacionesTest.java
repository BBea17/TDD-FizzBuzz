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
}