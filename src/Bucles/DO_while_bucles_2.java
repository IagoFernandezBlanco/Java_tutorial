
package Bucles;

import javax.swing.JOptionPane;

public class DO_while_bucles_2 {
    public static void main(String[] args){
        
        String sexo = "";
        
        // BUCLE PARA QUE EL USUARIO
        // INTRODUZCA SU SEXO, SI SU RESPUESTA ES INCORRECTA SE REPITE EL BUCLE
        // HASTA QUE PONGA UNA OPCION CORRECTA
        do{
            sexo = JOptionPane.showInputDialog("Dime tu sexo (H/M)");
        }while(sexo.equalsIgnoreCase("H")==false && sexo.equalsIgnoreCase("M")==false);
        
        // PEDIMOS ALTURA EN CM
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Pon tu altura en centimetros"));
        
        int pesoideal = 0;
        
        if (sexo.equalsIgnoreCase("H")){
            pesoideal=altura-110;
        }else if(sexo.equalsIgnoreCase("M")){
           pesoideal=altura-120;
        }
        
        System.out.println("Tu peso es " + pesoideal + " kilos");
    } 
    
}
