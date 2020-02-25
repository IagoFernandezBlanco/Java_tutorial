
package primerospasos;

public class Variables {
     public static void main(String[] args) {
         
         //EJEMPLO DE DECLARACION DE VARAIBLES
         
         //DEcalaracion de variables en dos pasos
         //se han empleado parte de la memoria Ram para almacenar el numero 90
         //Esta variable puede ser declarada como byte, int, short o long
         //Pero con el byte llegara, debido a temas de optimizacion
           byte edad ;
           //necesita ser inicializada, si no dará un error 
           edad = 90;
         //Se imprime el valor de la variable edad   
         
         //Declaracion e inicializacion de variable en una sola linea
         //Depende del programa una es mas eficaz que otra
         byte edad1 = 90;
         
         
         //Una variable puede variar su valor a lo largo de un programa
         //de ahi su nombre
         
         //se cambia el valor de edad a 30
         //se imprimira 30 y 90 
         edad= 30;
           System.out.println(edad);
           System.out.println(edad1);
           
           
           //al cambiar el valor despues de el imprimir(los programas se lee de arriba a abajo)
           //no se vera ningun cambio en la variable pero en realidad si que lo hubo
           //pasa de valor 30 a 75
           //otro System servirá
           edad = 75;
           System.out.println(edad);
           
     }
}
