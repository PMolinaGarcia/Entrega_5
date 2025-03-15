package aplicacion;

import dominio.MetodosYEjercicios;

import java.util.*;

public class Principal {

    public static void main(String[] args) {


        int numeroNSuma = 10;
        System.out.println("\n\n La suma de los " + numeroNSuma + " primeros numeros es " + MetodosYEjercicios.sumaNTerminos(numeroNSuma));

        int numeroFactorial = 10;
        System.out.println("\n\n El factorial de " + numeroFactorial + " es " + MetodosYEjercicios.factorial(numeroFactorial));

        int base = 2;
        int exponente = 6;
        System.out.println("\n\n " + base + " elevado a " + exponente + " es " + MetodosYEjercicios.potencia(base, exponente));

        Integer[] arrayDadoSuma = {1,2,3,4};
        List <Integer> listaDadaSuma = Arrays.asList(arrayDadoSuma);
        System.out.println("\n\n La suma de la lista " + listaDadaSuma + " es " + MetodosYEjercicios.sumaLista(listaDadaSuma));

        Integer[] arrayDadoMedia = {1,2,3,4};
        List <Integer> listaDadaMedia = Arrays.asList(arrayDadoMedia);
        System.out.println("\n\n La media aritmetica de la lista " + listaDadaMedia + " es " + MetodosYEjercicios.mediaLista(listaDadaMedia));

        Integer[] arrayDadoDesvTip = {2,4,5,8,3};
        List <Integer> listaDadaDesvTip = Arrays.asList(arrayDadoDesvTip);
        System.out.println("\n\n La desviacion tipica de " + listaDadaDesvTip + " es " + MetodosYEjercicios.desvTipicaLista(listaDadaDesvTip));

        int numeroNSumaPares = 10;
        System.out.println("\n\n La suma de los numeros pares hasta "+ numeroNSumaPares + " es " + MetodosYEjercicios.sumaParesHastaN(numeroNSumaPares));

        Integer[] arrayDadoSumaPares = {1,2,3,4,5,6};
        List <Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        System.out.println("\n\n La suma de los numeros pares de la lista " + listaDadaSumaPares + " es " + MetodosYEjercicios.sumaParesLista(listaDadaSumaPares));

        Integer[] arrayDadoListaPares = {1,2,3,4,5};
        List <Integer> listaDadaListaPares= Arrays.asList(arrayDadoListaPares);
        System.out.println("\n\n De la lista " + listaDadaListaPares + ", extraemos la lista de pares " + MetodosYEjercicios.listaParesDeLista(listaDadaListaPares));

        int numeroNListaPares = 10;
        System.out.println("\n\n La lista de los numeros pares hasta " + numeroNListaPares + " es " + MetodosYEjercicios.listaParesHastaN(numeroNListaPares));

        Integer[] arrayVector1 = {1,2,3};
        Integer[] arrayVector2 = {3,2,1};
        List <Integer> vector1 = Arrays.asList(arrayVector1);
        List<Integer> vector2 = Arrays.asList(arrayVector2);
        System.out.println("\n\n El producto escalar de " + vector1 + " y " + vector2 + " es " + MetodosYEjercicios.calcularProductoEscalar(vector1, vector2));

    }
}
