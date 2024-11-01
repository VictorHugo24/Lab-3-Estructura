/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victor_estructura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tocinito
 */
public class Rodriguez_Victor_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int op;
        int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;
        Random random = new Random();
        int opcion;
        int contadorPalabraAlReves = 0;
        int contadorNumeroPerfecto = 0;
        int contadorPrimos = 0;
        int contadorVotaciones = 0;

        do {
            System.out.println("Menú:");
            System.out.println("1. Palabra Alrevés");
            System.out.println("2. Número Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            op = scanner.nextInt();

            if (op == 1){
                System.out.print("Ingrese una palabra: ");
                String palabra = scanner.next();
                String palabraAlReves = "";
                for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraAlReves += palabra.charAt(i); 
        }
                System.out.println("Palabra al revés: " + palabraAlReves);
                 contadorPalabraAlReves++;
            } else if (op == 2){
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                int sumaDivisores = 0; 
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) sumaDivisores += i;
                }
                System.out.println(numero + (sumaDivisores == numero ? " es un número perfecto." : " no es un número perfecto."));
                contadorNumeroPerfecto++;
            } else if (op == 3) {
                int numero = random.nextInt(100) + 1;
                int divisores = 0;
                System.out.print("Divisores de " + numero + ": ");
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        System.out.print(i + " ");
                        divisores++;
                    }
                }
                
                System.out.println("\n" + numero + (divisores == 2 ? " es un número primo." : " no es un número primo."));
                contadorPrimos++;
            } else if (op == 4) {
                System.out.print("Ingrese la cantidad de votantes: ");
                int votantes = scanner.nextInt();
                for (int i = 1; i <= votantes; i++) {
                    System.out.print("Voto " + i + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                    String voto = scanner.next().toUpperCase();
                    switch (voto) {
                        case "AZUL": azul++; break;
                        case "ROJO": rojo++; break;
                        case "NEGRO": negro++; break;
                        case "AMARILLO": amarillo++; break;
                        default: nulo++; break;
                    }
                }
                int totalVotosValidos = azul + rojo + negro + amarillo;
                double porcentajeValido = (totalVotosValidos * 100.0) / votantes;
                if (porcentajeValido >= 60) {
                    System.out.println("Ganador: " + 
                        (azul > rojo && azul > negro && azul > amarillo ? "AZUL" : 
                        rojo > azul && rojo > negro && rojo > amarillo ? "ROJO" : 
                        negro > azul && negro > rojo && negro > amarillo ? "NEGRO" : 
                        amarillo > azul && amarillo > rojo && amarillo > negro ? "AMARILLO" : "EMPATE"));
                } else {
                    System.out.println("VOTACIÓN FALLIDA");
                }
                contadorVotaciones++;
            } else if (op == 5) {
                System.out.println("Saliendo del programa...");
                System.out.println("Veces ingresadas en cada opción:");
                System.out.println("1. Palabra Alreves: " + contadorPalabraAlReves);
                System.out.println("2. Número Perfecto: " + contadorNumeroPerfecto);
                System.out.println("3. Primos: " + contadorPrimos);
                System.out.println("4. Votaciones: " + contadorVotaciones);
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (op != 5);
    }
    }
    

