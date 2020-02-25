
package string;

public class ManipulaCadenas2 {
    public static void main(String[] args){
        //MAS METODOS DELA CLASE STRING
        
        //METODO SUBSTRING; QUE PERMITE EXTRAER CARACTERES DEUNA CDENA MAS GRANDE
        String frase = "hoy es un estupendo dia para aprender a programar en Java";
        
        //ESTO ES POSBLE
        //EN LA NUEVA VARIABLE; SE ALMCENA LO QUE SE RECOGE CON EL METODO .SUBSTRING
        //Y SE LE AÑADE ADEMAS UNA NUEVA CADENA EXTRA 
        String frase_resumen = frase.substring(0, 28) + " que maravilla de dia " + " y " + 
                frase.substring(29, 57);
        System.out.println("Mi nueva cadena es " + frase_resumen);
        
        
    }
}
