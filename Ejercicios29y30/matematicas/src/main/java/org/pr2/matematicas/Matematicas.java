package main.java.org.pr2.matematicas;

public class Matematicas{
    public static int sumaNumeros(int n){
        if (n < 0) throw new ArithmeticException("La suma hasta el n-�simo n�mero natural no es aplicable a un n menor que 0");
        return n == 0?0:n + sumaNumeros(n - 1);}
}
