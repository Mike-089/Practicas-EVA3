/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce el valor entero de x: ");
                x = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("La captura es incorrecta: " + e.getMessage());
            }

        } while (true);

        do {
            try {
                System.out.println("Introduce el valor entero de y: ");
                y = sc.nextInt();
                if (y == 0) {
                    System.out.println(" y no puede ser igual a cero. Introduzca un valor diferente.");
                } else {
                    int resu = x / y;
                    System.out.println("La division de " + x + "/" + y + " es: " + resu);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La captura es incorrecta: " + e.getMessage());
            }
        } while (true);

        do {
            try {
                int resu = x / y;
                System.out.println("La division de " + x + "/" + y + " es: " + resu);
                break;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero: ");
            }
        } while (true);

        System.out.println("Programa Terminado Con Exito");
    }

}
