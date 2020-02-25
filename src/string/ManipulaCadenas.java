
package string;

public class ManipulaCadenas {
    public static void main(String[] args){
        //APRENDIZAJE DEL MANEJO DE CADENAS DE CARATERES
        //LOS DATOS STRING SIEMRE ENTRE COMILLAS DOBLES
        String nombre = "Iago";
        
        System.out.println("Mi nombre es " + nombre);
        
        //EMPLEACION DE ALGUNS METODOS DE LA CLASE STRING
        //DEVUELVE EL NUMERO DE CARACTERES DE NUESTRO STRING
        System.out.println("Mi nombre tiene " + nombre.length() + " letras ");
        
        //DEVUELVE LA LETRA QUE SE ENCUENTRA EN LA POSICION QUE SE LE INDICA
        
        System.out.println("La primera letra de " + nombre + " es "  + nombre.charAt(0));
        
        
        //METODO PARA AVERIGUAR LA ULTIMA LETRA DE UNA CADENA DE CARACTERES
        int ultima_letra;
        
        //ESTAMOS ALMACENANDO LA LONGITUD DE UNA CADENA ("NOMBRE") EN LA NUEVA VARIABLE
        ultima_letra = nombre.length();
          
        System.out.println("La ultima letra es " + nombre.charAt(ultima_letra-1));
    }
}
