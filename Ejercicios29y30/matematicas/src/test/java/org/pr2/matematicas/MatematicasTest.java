package test.java.org.pr2.matematicas;
import main.java.org.pr2.matematicas.Matematicas;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicasTest{
    @Test
    public void sumaCero(){
        assertEquals(0, Matematicas.sumaNumeros(0));
    }
    @Test
    public void sumaPositivo(){assertEquals(6, Matematicas.sumaNumeros(3));
    }
    @Test(expected = ArithmeticException.class)
    public void sumaNegativo(){
        Matematicas.sumaNumeros(-1);
    }
}