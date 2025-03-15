package dominio;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MetodosTest {

    @org.junit.jupiter.api.Test
    void sumaNTerminosCero() {
        int resultado = MetodosYEjercicios.sumaNTerminos(0);
        assertEquals(0,resultado);
    }
    @org.junit.jupiter.api.Test
    void sumaNTerminosNormales() {
        int resultado = MetodosYEjercicios.sumaNTerminos(5);
        assertEquals(15,resultado);
    }

    @org.junit.jupiter.api.Test
    void factorialCero() {
        int resultado = MetodosYEjercicios.factorial(0);
        assertEquals(1,resultado);
    }
    @org.junit.jupiter.api.Test
    void factorialUno() {
        int resultado = MetodosYEjercicios.factorial(1);
        assertEquals(1,resultado);
    }
    @org.junit.jupiter.api.Test
    void factorialNormal() {
        int resultado = MetodosYEjercicios.factorial(5);
        assertEquals(120, resultado);
    }

    @org.junit.jupiter.api.Test
    void potenciaCeroALaCero() {
        int resultado = MetodosYEjercicios.potencia(0,0);
        assertEquals(1, resultado);
    }
    @org.junit.jupiter.api.Test
    void potenciaCeroALaN() {
        int resultado = MetodosYEjercicios.potencia(0,12);
        assertEquals(0, resultado);
    }
    @org.junit.jupiter.api.Test
    void potenciaUno() {
        int resultado = MetodosYEjercicios.potencia(1,5);
        assertEquals(1,resultado);
    }
    @org.junit.jupiter.api.Test
    void potenciaNormal() {
        int resultado = MetodosYEjercicios.potencia(3,4);
        assertEquals(81, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaListaVacia() {
        Integer[] arrayDadoSuma = {};
        List<Integer> listaDadaSuma = Arrays.asList(arrayDadoSuma);
        int resultado = MetodosYEjercicios.sumaLista(listaDadaSuma);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaLista() {
        Integer[] arrayDadoSuma = {1,2,3,4,5};
        List<Integer> listaDadaSuma = Arrays.asList(arrayDadoSuma);
        int resultado = MetodosYEjercicios.sumaLista(listaDadaSuma);
        assertEquals(15, resultado);
    }

    @org.junit.jupiter.api.Test
    void mediaListaVacia() {
        Integer[] arrayDadoMedia = {};
        List<Integer> listaDadaMedia = Arrays.asList(arrayDadoMedia);
        double resultado = MetodosYEjercicios.mediaLista(listaDadaMedia);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void mediaListaIguales() {
        Integer[] arrayDadoMedia = {1,1,1,1,1};
        List<Integer> listaDadaMedia = Arrays.asList(arrayDadoMedia);
        double resultado = MetodosYEjercicios.mediaLista(listaDadaMedia);
        assertEquals(1, resultado);
    }

    @org.junit.jupiter.api.Test
    void mediaLista() {
        Integer[] arrayDadoMedia = {1,2,3,4,5};
        List<Integer> listaDadaMedia = Arrays.asList(arrayDadoMedia);
        double resultado = MetodosYEjercicios.mediaLista(listaDadaMedia);
        assertEquals(3, resultado);
    }

    @org.junit.jupiter.api.Test
    void desvTipicaListaVacia() {
        Integer[] arrayDadoDesv = {};
        List<Integer> listaDadaDesv = Arrays.asList(arrayDadoDesv);
        double resultado = MetodosYEjercicios.desvTipicaLista(listaDadaDesv);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void desvTipicaListaIguales() {
        Integer[] arrayDadoDesv = {1,1,1,1,1};
        List<Integer> listaDadaDesv = Arrays.asList(arrayDadoDesv);
        double resultado = MetodosYEjercicios.desvTipicaLista(listaDadaDesv);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void desvTipicaLista() {
        Integer[] arrayDadoDesv = {1,2,3,4,5};
        List<Integer> listaDadaDesv = Arrays.asList(arrayDadoDesv);
        double resultado = MetodosYEjercicios.desvTipicaLista(listaDadaDesv);
        assertEquals(1.414, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesHastaNCero() {
        int resultado = MetodosYEjercicios.sumaParesHastaN(0);
        assertEquals(0,resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesHastaNNegativo() {
        int resultado = MetodosYEjercicios.sumaParesHastaN(-7);
        assertEquals(0,resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesHastaNPositivo() {
        int resultado = MetodosYEjercicios.sumaParesHastaN(7);
        assertEquals(12,resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaVacia() {
        Integer[] arrayDadoSumaPares = {};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaNegativos() {
        Integer[] arrayDadoSumaPares = {-2,-3,-1,-7,-8};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(-10, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaPositivos() {
        Integer[] arrayDadoSumaPares = {2,3,1,7,8};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(10, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaMixtos() {
        Integer[] arrayDadoSumaPares = {-2,-3,1,-7,8};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(6, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaTodoPares() {
        Integer[] arrayDadoSumaPares = {-2,-4,-6,100,-8};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(80, resultado);
    }

    @org.junit.jupiter.api.Test
    void sumaParesListaTodoImpares() {
        Integer[] arrayDadoSumaPares = {-1,3,175,-1081,5};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        int resultado = MetodosYEjercicios.sumaParesLista(listaDadaSumaPares);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesDeListaVacia() {
        Integer[] arrayDadoListaPares = {};
        List<Integer> listaParesListaDada = Arrays.asList(arrayDadoListaPares);
        List<Integer> resultado = MetodosYEjercicios.listaParesDeLista(listaParesListaDada);
        Integer[] arrayEjemplo = {};
        List<Integer> listaParesEjemplo = Arrays.asList(arrayEjemplo);
        assertEquals(listaParesEjemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesDeListaPositivos() {
        Integer[] arrayDadoListaPares = {1,2,3,4,5,6};
        List<Integer> listaParesListaDada = Arrays.asList(arrayDadoListaPares);
        List<Integer> resultado = MetodosYEjercicios.listaParesDeLista(listaParesListaDada);
        Integer[] arrayEjemplo = {2,4,6};
        List<Integer> listaParesEjemplo = Arrays.asList(arrayEjemplo);
        assertEquals(listaParesEjemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesDeListaNegativos() {
        Integer[] arrayDadoListaPares = {-1,-2,-3,-4,-5,-6};
        List<Integer> listaParesListaDada = Arrays.asList(arrayDadoListaPares);
        List<Integer> resultado = MetodosYEjercicios.listaParesDeLista(listaParesListaDada);
        Integer[] arrayEjemplo = {-2,-4,-6};
        List<Integer> listaParesEjemplo = Arrays.asList(arrayEjemplo);
        assertEquals(listaParesEjemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesDeListaMixtos() {
        Integer[] arrayDadoListaPares = {1,-2,-3,4,-5,6};
        List<Integer> listaParesListaDada = Arrays.asList(arrayDadoListaPares);
        List<Integer> resultado = MetodosYEjercicios.listaParesDeLista(listaParesListaDada);
        Integer[] arrayEjemplo = {-2,4,6};
        List<Integer> listaParesEjemplo = Arrays.asList(arrayEjemplo);
        assertEquals(listaParesEjemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesHastaNVacia() {
        List<Integer> resultado = MetodosYEjercicios.listaParesHastaN(0);
        Integer[] arrayEjemplo = {};
        List<Integer> ejemplo = Arrays.asList(arrayEjemplo);
        assertEquals(ejemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesHastaNParPositivos() {
        List<Integer> resultado = MetodosYEjercicios.listaParesHastaN(10);
        Integer[] arrayEjemplo = {10,8,6,4,2};
        List<Integer> ejemplo = Arrays.asList(arrayEjemplo);
        assertEquals(ejemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void listaParesHastaNImparPositivos() {
        List<Integer> resultado = MetodosYEjercicios.listaParesHastaN(11);
        Integer[] arrayEjemplo = {10,8,6,4,2};
        List<Integer> ejemplo = Arrays.asList(arrayEjemplo);
        assertEquals(ejemplo, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalarVectoresVacios() {
        Integer[] array1 = {};
        Integer[] array2 = {};
        List <Integer> vector1 = Arrays.asList(array1);
        List <Integer> vector2 = Arrays.asList(array2);
        int resultado = MetodosYEjercicios.calcularProductoEscalar(vector1, vector2);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalarVectoresDistintos() {
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {1,2};
        List <Integer> vector1 = Arrays.asList(array1);
        List <Integer> vector2 = Arrays.asList(array2);
        int resultado = MetodosYEjercicios.calcularProductoEscalar(vector1, vector2);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalarVectoresIguales() {
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {1,2,3};
        List <Integer> vector1 = Arrays.asList(array1);
        List <Integer> vector2 = Arrays.asList(array2);
        int resultado = MetodosYEjercicios.calcularProductoEscalar(vector1, vector2);
        assertEquals(14, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalarVectoresMismosNumeros() {
        Integer[] array1 = {1,1,1};
        Integer[] array2 = {1,1,1};
        List <Integer> vector1 = Arrays.asList(array1);
        List <Integer> vector2 = Arrays.asList(array2);
        int resultado = MetodosYEjercicios.calcularProductoEscalar(vector1, vector2);
        assertEquals(3, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalarVectoresDistintosMismaLongitud() {
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {4,5,6};
        List <Integer> vector1 = Arrays.asList(array1);
        List <Integer> vector2 = Arrays.asList(array2);
        int resultado = MetodosYEjercicios.calcularProductoEscalar(vector1, vector2);
        assertEquals(32, resultado);
    }
}