
package primerospasos;
  
public class ClaseMath {
      public static void main(String[] args) {
          
          //Ejercicio para el aprendizaje de la clase Math.
          //Raiz cuadrada
          //Este metodo SQRT necesita recibir un parametro duble
          // Y el resultado ha de ser guardado en una variable double
          //Si no dara error
          double raiz = Math.sqrt(25);
          System.out.println(raiz);
          
          //Metodo round
          //Se emplea para redondear valores decimales
          //Es necesario un recasteo, si no dara  error
          //Debido a que el math.round devuelve un long 
          //y lo queremos guardar en una variable de tipo int
          double num1 = 5.85;
          int resultado = (int)Math.round(num1);
          System.out.println(resultado);
          
          
          //Método pow
          //Se emplea para potencias
          //Se necesitan dos valores double para realizar esta operacion
          double base = 5;
          double exponente =3;
          int rsultado2 = (int)Math.pow(base, exponente);
          System.out.println(rsultado2);
          
          
          //Metodo random
          //Devuelve un valor situado entre 0.0 y 1.0
          double resultado3 = Math.random();
          System.out.println(resultado3);
          
          
      }
}
