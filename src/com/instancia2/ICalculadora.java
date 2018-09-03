package com.instancia2;

/**
 * Interface funcional para realizar una calculadora, unico método que tenga dos parametros de entrada
 * de tipo doble y una salida de tipo doble
 */
@FunctionalInterface
public interface ICalculadora {

    public double calcular (double a, double b);


}
