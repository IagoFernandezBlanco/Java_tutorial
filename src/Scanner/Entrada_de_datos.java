
package Scanner;

import java.util.Scanner;

public class Entrada_de_datos {

    public Entrada_de_datos() {
    }
    public static void main(String []args){
        
        // ENTRADA DE DATOS MEDIANTE LA CLASE SCANNER
        //PARA PODER EMPLEAR LOS METODOS DE LACLASE SCANNER
        //AL NO SER STATIC, ES NECEARIO CREAR UN OBJETO DE TIPO SCANNER
        // EL CUAL SE CREA MEDIANTE UN CONSTRUCTOR; 
        // AL QUE SE LE PASA COMO ARGUMENTO LA COSNOLA DEL SISTEM (SYSTEM.IN)
       Scanner entrada = new Scanner(System.in);
       
       
        System.out.println("Introduce tu nombre, por favor");
        //SE CRE UNA VARIABLE DONDE SE ALMACENARA EL NOMBRE QUE SE VAYA A INTRODUCIR
        // EL PROGRAMA SE QUEDA EN ESPERA HASTA QUE SE ESCRIBA AGO EN LA CONSOLA
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce tu edad");
        
        // SE CREA UNA VARIABLE DONDE SE ALMACENARA LA EDAD 
        // EL PROGRAMA SE QUEDA A LA ESPERA HASTA QUE SE ESCRIBA ALGO EN LA CONSOLA
        int edad = entrada.nextInt();
        if(edad <=30){
        System.out.println("Hola "+ nombre_usuario+ " bienvenido" + ", y tu edad es de " + edad + " . Estas hecho un chaval");
        }else if(edad >30){
            System.out.println("Hola " + nombre_usuario+ " bienvenido " + " , y tu edad es de " + edad + " . Eres un veterano");
    }
        }
}
