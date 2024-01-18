package org.example;

import java.util.*;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");
            // Mostramos el menú
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que esté dentro de las opciones del menú
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operación
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.println("Operación a realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Dame el primer número: ");
        var op1 = Double.parseDouble(consola.nextLine());
        System.out.print("Dame el segundo número: ");
        var op2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = op1 + op2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> {
                resultado = op1 - op2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> {
                resultado = op1 * op2;
                System.out.println("Resultado multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = op1 / op2;
                System.out.println("Resultado división: " + resultado);
            }
            default -> {
                System.out.println("Opción errónea: " + operacion);
            }
        }
    }
}
