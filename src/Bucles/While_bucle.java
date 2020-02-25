
package Bucles;

import javax.swing.JOptionPane;

public class While_bucle {
    public static void main(String[] args){
        // APLICACION QUE PIDE UNA CONTRASEÑA
        // EMPLEO DE WHILE
        
        //Minetras la condicion no se cumpla se ejecutara el mismo codigo
        // hasta el infinito
        String clave ="Iago";
        String password ="";
        
        // Mientras la clav y la pass sean diferentes
        // se ejecuta este codigo
        while (clave.equals(password)==false){
            password = JOptionPane.showInputDialog("Introduce la contraseña");
            
            // al introducir mediante JOptionPane
            // se accede a este if
            // Si siguen siendo diferentes, se muestra mensaje
            if(clave.equals(password)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
        // si se cumple qeu son ciertas se accede a este mensaje
        System.out.println("Contraseña correcta");
        
        
    }
}
