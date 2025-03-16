package org.pr2;

import org.junit.Test;
import main.java.org.pr2.matematicas.Matematicas;
import static org.junit.Assert.*;

/*
Esta es la clase de los test del método que tenemos en la clase Matemáticas.
 */
public class MatematicasTest{

    /*
    Creamos un test para cada caso que podamos contemplar para el método dado.
    En este primero, vemos lo que ocurre al sumar el 0 nada más. Se espera que resulte en 0 y se compara con el resultado real.
     */
    @Test public void sumaCero(){
        assertEquals(0, Matematicas.sumaNumeros(0));}

    /*
    En este segundo caso, comprobamos qué ocurre al sumar números positivos. Para los 3 primeros, esperamos que el resultado sea 6,
    pero comparamos con el número resultante de aplicar el método el parámetro 3.
     */
    @Test public void sumaPositivo(){
        assertEquals(6,Matematicas.sumaNumeros(3));}

    /*
    En este último caso, comprobamos lo que ocurre al sumar números negativos. Esperamos que se eleve una excepción de tipo
    ArithmeticException, que se compara con lo que ocurre al pasar -1 como parámetro al método.
     */
    @Test(expected = ArithmeticException.class)
    public void sumaNegativo(){Matematicas.sumaNumeros(-1);}}
