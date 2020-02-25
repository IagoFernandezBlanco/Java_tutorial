
package string;

public class ManipulaCadenas3 {
    public static void main(String[] args){
        //ULTIMO METODO QUE SE APRENDERA A USAR
        //A PARTIR DE AQUI ES EXPERIMENTACION PROPIA
        String alumno1, alumno2;
        alumno1= "David";
        alumno2 = "david";
        
        //SE COMPARA LAS DOS CADENAS DCARACTERES
        //DEVUELVE TRUE SI SON LAS DOS IGUALES Y FALSE SI SON DISTINTAS
        System.out.println(alumno1.equals(alumno2));
        
        //ESTE METODO ES SIMILAR A EQUALS PERO SE DIFERENCIA
        //ESTE NO DIFERENCIA ENTRE MAYSUCULAS Y MINUSCULAS
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        //ESTE METODO RETORNA EL VALOR DEL STRING SIN MAS
        System.out.println(alumno1.toString());
    }
}
