
package Bucles;

import javax.swing.JOptionPane;

public class For_bucle_Ejercicio {
    /*
    Ejercicio mas complejo de bucle for
    Se pide si una direccion de correo posee un @
    */
    public static void main(String[] args){
        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Introduce tu e-mail");
        /*
        Se especifica en el bucle que mientras i sea menor que la longitud de nuestra cadena
        SIga el bucle sin parar
        */
        for (int i=0;i<mail.length();i++){
            /*
            Cada vez que nuestro bucle se ejecuta
            Recoge cada letra que pasa(cada vez que el bucle se repite coge la letra correspondiente del emali)
            El momento en el que detecte un Arroba en nuestra cadena el valor de arroba pasara a true
            Se podia decir que la variable i funciona como un indice
            */
        if(mail.charAt(i)=='@'){
            arroba = true;
        }
    }
        if(arroba==true){
            System.out.println("Correo aceptado");
        }else{
            System.out.println("No es correo valido");
        }
    }
}
