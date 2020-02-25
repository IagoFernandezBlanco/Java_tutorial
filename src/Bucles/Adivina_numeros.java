
package Bucles;

import java.util.Scanner;

public class Adivina_numeros {
    public static void main(String[] args){
     // PEQUEÑO JUEGO
     // EL PROGRAMA GENERE UN NUMERO ALEATORIO
     // DEBEMOS ACERTARLO
     
     
     //ESTE CODIGo GENERA UN NUMERO ENTRE CERO Y 100
     // LO ALMACENA EN UN INT
        int aleatorio = (int)(Math.random()*100);
       
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
        
        // COMO EL NUMERO GENERADO ES DIFERENTE A ALEATORIO
        // TE PIDE QUE INTRODUZCAS UN NUMERO
        // LO EVALUA COMPARANDOLO CON ALEATORIO
        // Y DEPENDIENDO DE TU NUMERO Y ALEATORIO SALTA UNA DE LAS CONDICIONES
        
        // COMO CADA VEZ QUE TE EQUIVOCAS VUELVE A EJECUTAR EL WHILE
        // SE PONE UN INCREMENTO A INTENTOS Y VA SUMANDO UNO CADA VEZ QUE SE VUELVE A EJECUTAR EL WHILE
        while(numero != aleatorio){
            intentos++;
            System.out.println("Introduce un numero por favor");
            numero = sc.nextInt();
            
            if(aleatorio < numero){
                System.out.println("Te has pasado de lanza");
            }else if(aleatorio > numero){
                System.out.println("Te has quedado corto");
            }
            
        }
      
        
        System.out.println("Has acertado");
        System.out.println("Has necesitado " + intentos + " intentos");
    }
}
