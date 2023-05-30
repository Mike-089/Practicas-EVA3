/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Eva3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        // ARITHMETIC EXCEPTION:
        // SON TODAS DE RUNTIMEEXCEPTION
        
        //divisionn entre cero
        System.out.println("INICIANDO EL PROGRAMA");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("CALCULANDO LA DIVISION");
        System.out.println("Division:" + resu);
         

        //  IMPUTMISMATCH EXCEPTION: ERROR DE CAPTURA DE DATOS
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int nume = input.nextInt();
        System.out.println("Tu numero es: + nume");
         
        
        //INDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5]; // 0 - (N - 1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; // error de lógica: 5 no es una posicion valida
        
        
        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba.x);
    }

}

class Prueba{
    public int x = 100;
}
