
package Bucles;

import java.util.Scanner;

public class Do_while_bucles {
    public static void main(String[] args){
        
        // PEQUEÑO EJEMPLO DE DO-WHILE
        // LA DIFERENCIA ENTRE WHILE y DO-WHILE
        // EL BUCLE WHILE HAY LA OPCION DE QUE NO SE EJECUTE NI UNA SOLA VEZ
        // DO WHILE AL MENOS PERMITE UNA EJECUCION MINIMA
         int aleatorio = (int)(Math.random()*100);
       
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
       // ESTE BUCLE EN CASO DE QUE NUMERO Y ALEATORIO SEAN IGUALES
       // (COMPICADO PERO POSIBLE)
       // EL CODIGO SE EJECUTARA AL MENOS UNA VEZ, NO COMO EN EL BUCLE WHILE
       // QUE SI FUERAN IGUALES NI UNA SOLA VEZ SE EJECUTARIA
        
        
       do{
            intentos++;
            System.out.println("Introduce un numero por favor");
            numero = sc.nextInt();
            
            if(aleatorio < numero){
                System.out.println("Te has pasado de lanza");
            }else if(aleatorio > numero){
                System.out.println("Te has quedado corto");
            }
            
        }while(numero!=aleatorio);
      
        
        System.out.println("Has acertado");
        System.out.println("Has necesitado " + intentos + " intentos");
        
    }
}
