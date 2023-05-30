/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

import java.util.Scanner;


/**
 *
 * @author migue
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        //chacked: es forzoso atenderlas
        //unchecked: errores de logica, no es forzoso resolverlas
        //int resu = 5/0
        try {
            obj.capturaMayorCero(100);
            System.out.println("Introduce un valor");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
        } catch (Exception ex) {
            //NO ES BUNE USAR EXCEPTION, YA QUE ES
            //LA SUPERCLASE DE LOS EXCEPCIONES. VA
            //A CAPTURAR CUALQUIER EXCEPCION
            System.out.println(ex.getMessage());
        }
        try{
        obj.division(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

class Prueba{
     public void capturaMayorCero(int valor) throws Exception{
         if (valor <= 0)// voy a generar una excepcion
             throw new Exception(valor + " es negativo, solo se aceptan valores mayores a cero");
             
         System.out.println("El valor es:" + valor);
     }
     
     public int division (int x, int y)  throws ArithmeticException{
         if(y==0)
             throw new ArithmeticException("El valor del divisor es cero y es invalido");
         return x / y;
     }
}