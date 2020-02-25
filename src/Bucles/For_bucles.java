
package Bucles;

public class For_bucles {
    public static void main(String[] args){
        // PEQUEÑO EJEMPLO DE BUCLE FOR
        //REPETIRA NUESTRO NOMBRE DIEZ VECES
        
        String nombre = "iago";
        /*
        LA ESTRUCTURA DE UN BUCLE FOR ES
        for(variable = numero; variable numero de veces que queremos que se haga el bucle;incrementador de variable)
        */
        
        /*
        Este ejemplo realiza la impresion de nuestro nombre 10 veces
        */
        for(int i=0;i<10;i++){
            System.out.println(nombre);
        }
        
        /*
        Otro ejemplo de bucle for
        */
        
        for(int y=10;y>0;y--){
            System.out.println(nombre);
    }
        
        /*
        otro ejemplo de bucle for
        z se incrementa dos veces cada vez que se inicia el bucle
        */
        
        for(int z=0;z<20;z+=2){
            System.out.println(nombre);
        }
    }
}
