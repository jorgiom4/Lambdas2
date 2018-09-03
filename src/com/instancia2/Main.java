package com.instancia2;

public class Main {

    public static void main(String[] args) {

        ICalculadora iC = (a, b) -> a + b;
        System.out.println("Sumar: " + iC.calcular(5.4, 6.4));

        //Reutilizamos el interface
        iC = (a, b) -> a - b;
        System.out.println("Restar: " + iC.calcular(10, 4));

        //Reutilizamos el interface
        iC = (a, b) -> a * b;
        System.out.println("Multiplicar: " + iC.calcular(10, 4));

        //Reutilizamos el interface
        iC = (a, b) -> a / b;
        System.out.println("Division: " + iC.calcular( 10, 4));

    }
}
