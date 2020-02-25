
package Formateo;
import javax.swing.*;
public class Formateo_datos {
    public static void main(String[]args){
        //PARA DARLE FORMATO A UN VALOR DE UNA VARIBALE
        // DE UN RESULTADO QUE QUEREMOS IMPRIMIR
        // SE EMPLEA EL METODO PRINTF, EL CUAL 
        // LE DEBEMOS PASAR EL FROMATO ADECUADO Y LO QUE SE QUIERES IMPRIMIR
        // ESTE NOS DA SOLO DOS DECIMALES
        double x = 10000.0;
        
        System.out.printf("%1.2f", x/3);
        
        // COMO ES METODO STATIC ES NECESARIO HACER MENCION A LA CLASE A LA QUE PERTENECE
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        
        // EL STRING ALAMCENADO EN NUM1 SE TRANSFORMA EN DOUBLE
        double num2 = Double.parseDouble(num1);
        System.out.print( " La raíz de " + num2 + " es ");
        
        System.out.printf("%1.2f", Math.sqrt(num2));
        
        
        
    }
}
