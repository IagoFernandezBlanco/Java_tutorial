
package joptionpane;

import javax.swing.JOptionPane;

public class Joptionpane {
    public static void main(String []args){
        //OTRO SISTEMA PARA INTRODUCCION DE DATOS EN NUESTRO PROGRAMA
        //JOPTIONPANE DA LUGAR A VENTANAS CON LAS QUE SE PUEDE INTERACTUAR
        // EN ESTE CASO APARECE UNA VENTANA CON UN CUADRO QUE PODEMOS ESCRIBIR EN EL
        // LO QUE SE ESCRIBA, SE ALMACENA EN NUESTRA VARIABLE, Y SE PUEDE USAR A CONTINUACION
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        
        
        // ALGUNAS VECES ES NECESARIO USAR UN INT, DOUBLE, ETC
        // ELPROBLEMA SURGE QUE NO SE PUEDE ALMACENAR UN STRING EN UN INT
        //  POR LO TANTO SE RECURRE AL METODO PARSE. PARA CAMBIAR DE STRING A EL TIPO DE VARIABLE QUE QURAMOS
        String edad = JOptionPane.showInputDialog("Dime tu edad por favor");
        
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola " + nombre_usuario + " que tal?. Tienes una edad de " + edad_usuario + " El año que viene tendrás " + (edad_usuario+1));
         
    }
}
