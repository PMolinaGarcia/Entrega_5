package dominio;

import java.util.ArrayList;
import java.util.List;

public class MetodosYEjercicios {

    /*
    Ejercicio 27. Explique los siguientes conceptos:

    1. Prueba de caja blanca: en la que se prueba la estructura de control del programa; se ven aquellas partes del código
    que se están probando. Se suele utilizar para pequeñas unidades funcionales.

    2. Prueba de caja negra: aquella en la que se prueban los requisitos funcionales del programa; es decir, las entradas
    que le pasamos y los resultados esperados. Se comprueba que el programa hace lo que tiene que hacer. Más propio de fases
    finales del programa.

    3. Prueba unitaria: aquellas en las que solo probamos piezas del código. En POO, cada uno de los métodos.

    4. Prueba de integración: aquellas que realizamos tras incorporar un cambio para comprobar que dicho cambio no ha
    afectado en otras partes del código.

    5. Prueba de sistema: son aquellas en las que sometemos al programa a sus límites y condiciones más allá de los mismos,
    de tal forma que probemos la robustez del programa.

    6. Prueba de aceptación: también conocidas como pruebas de validación, son aquellas en las que mostramos al cliente el
    funcionamiento del programa. Existen dos tipos: por una parte, las pruebas alfa son aquellas guiadas por alguien de la empresa
    desarrolladora del programa; por otra parte, tenemos las pruebas beta, que son aquellas en las que el cliente prueba el
    programa por sí mismo. Gracias a estas pruebas, el cliente puede notificar aquello que no ve bien en el programa.

    Ejercicio 28. Diseñe pruebas para cada uno los programas del ejercicio 2.


     */

    public static int sumaNTerminos(int n){
        int suma=0;
        for (int i=0; i<=n; i++){
            suma += i;
        }
        return suma;
    }

    public static int factorial(int n){
        int factorial=1;
        for (int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int potencia(int n, int m){
        int potencia=1;
        for (int i=0; i<m; i++){
            potencia *= n;
        }
        return potencia;
    }

    public static int sumaLista(List<Integer> listaDada){
        int sumaLista=0;
        for (int i=0; i<listaDada.size(); i++){
            sumaLista+=listaDada.get(i);
        }
        return sumaLista;
    }

    public static double mediaLista(List <Integer> listaDada){

        int tamannio = listaDada.size();
        if (tamannio == 0){
            return 0.0;
        }
        return (double) MetodosYEjercicios.sumaLista(listaDada)/listaDada.size();
    }

    public static double desvTipicaLista(List <Integer> listaDada){
        int tamannioLista = listaDada.size();
        double parentesis=0;
        if (tamannioLista==0){
            return 0;
        }
        for (Integer num: listaDada){
            parentesis += Math.pow((num - MetodosYEjercicios.mediaLista(listaDada)),2);
        }
        return Math.sqrt(parentesis/(tamannioLista));
    }

    public static int sumaParesHastaN(int n){
        int sumaPares=0;
        if (n%2==1){
            n--;
        }
        while (n>=2){
            sumaPares+=n;
            n-=2;
        }
        return sumaPares;
    }

    public static int sumaParesLista(List<Integer> listaDada){
        int sumaPares=0;
        for (Integer num: listaDada){
            if (num%2==0){
                sumaPares+=num;
            }
        }
        return sumaPares;
    }

    public static List<Integer> listaParesDeLista(List<Integer> listaDada){
        List<Integer> listaPares = new ArrayList<>();
        for (Integer num: listaDada){
            if (num%2==0){
                listaPares.add(num);
            }
        }
        return listaPares;
    }

    public static List<Integer> listaParesHastaN(int n){
        List <Integer> listaPares = new ArrayList<>();
        if (n%2!=0){
            n-=1;
        }
        while (n>=2){
            listaPares.add(n);
            n-=2;
        }
        return listaPares;
    }

    public static int calcularProductoEscalar(List <Integer> vector1, List <Integer> vector2){
        if (vector1.size()!= vector2.size()){
            System.out.println("El producto escalar solo es posible entre vectores de las mismas dimensiones.");
        }
        int escalar = 0;
        for (int i = 0; i<vector1.size(); i++){
            escalar+=vector1.get(i)*vector2.get(i);
        }
        return escalar;
    }

}
