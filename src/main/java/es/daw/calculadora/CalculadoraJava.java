/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.daw.calculadora;

/**
 *
 * @author liyan
 */
public class CalculadoraJava {

    //Suma dos números
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Resta el segundo número al primero
    public double restar(double a, double b) {
        return a - b;
    }
    
    // Multiplica dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Divide el primer número entre el segundo
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
    
    // Calcula la potencia de un número elevado a otro
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
