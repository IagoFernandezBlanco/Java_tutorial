
package primerospasos;

public class DeclaracionesConstantes {
    public static void main(String[] args) {
        //Ejercicio BASICO de declaracion de CONSTANTES
        
        //UNA VARIABLE PERMITE  VARIAR UN VALOR DE ESTA MISMA
        
        int c = 5;
        c=7;
        System.out.println(c);

        //PERO UNA CONSTANTE NO PERMITE SER CAMBIADA A LO LARGODEL PROGRAMA
        //ESTO SE REALIZA GRACIAS A LA PALABRA RESERVADA FINAL
        
        //LAS CONSTANTES SON UTILES EN CIERTOS PROGRAMAS
        //CAMBIO DE UNIDADES
        //PRODUCTOS CON IMPUESTOS
        final double  apulgadas =2.54;
        
        //PEQUEÑO EJEMPLO DE PROGRAMA DE CAMBIO DE UNIDADES
        double cm = 6;
        
        double resultado = cm / apulgadas;
        
        //PEQUEÑO EJEMPLO DE CONCANTENACION
        System.out.println("En " + cm + " cm " + " hay " +  resultado + " pulgadas");
        
        
        //SE PUEDEN DECLARAR VARAIBLES EN LA MISMA LINEA
        //E INICIARLAS MAS ADELANTE
        
        int a,  b, f, valor;
        a = 1;
        b = 3;
        f = 5;
        valor = a+b+f;
        System.out.println(valor);
               
    }
}
