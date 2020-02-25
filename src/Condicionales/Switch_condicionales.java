
package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Switch_condicionales {
    public static void main(String[] args){
        //EJERCICO BASICO DE AREAS DE FIGURAS GEOMETRICAS
        Scanner sc = new Scanner(System.in);
        
        // EL \n  REALIZA UN SALTO DE LINEA
        System.out.println("Elige una opcion : \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circunferencia");
        
        // EL PROXIMO ENTERO INTRODUCIDO POR CONSOLA SERA ALMACENADO AQUI
        int figura = sc.nextInt();
        
        // ESTE CODIGO SE LLAMA SWITCH
        // EL SWITCH ANALIZA LA VARIABLE QUE SE LE PASA Y DEPENDIENDO DE SU VALOR
        // REALIZARA EL CASE QUE LE CORRESPONDE
        switch(figura){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale el lado"));
                System.out.println("El area del cuadrado equivale a " + Math.pow(lado,2) );
                
                break;
                
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale la altura"));
                System.out.println("El area del reactangulo " + base*altura);
                
                break;
            
            case 3:
              int base1 = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale la base"));
              int altura1 = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale la altura")); 
                System.out.println("El area del triangulo " + (base1*altura1)/2);
            
                break;
            case 4 :
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Cuanto equivale el radio"));
                System.out.print("El area del circulo es " );
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
             break; 
             
            default:
                System.out.println("Opcion incorrecta");
                     
        } 
    }
}
