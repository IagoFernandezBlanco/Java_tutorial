/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class If_Else_CONDICIONALES {
    public static void main(String[]args){
        // EJEMPLO BASICO DE COMO EMPLEAR CONDICIONALES
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicanos tu edad por favor");
        
        // EL SIGUEINTE NUMERO QUE SE ESCRIBA POR CONSOLA
        // SE ALMACENARA ES ESTA VARIABLE
        int edad = sc.nextInt();
        
        // NO PUEDE EXISTIR UN ELSE SIN UN IF
        // PERO SIAL CONTRARIO
        
        if(edad>=18){
            System.out.println("Tienes una edad de " + edad + " Por lo tanto eres mayor de edad");
        }else{
            System.out.println("Tienes una edad de " + edad + " Por lo tanto eres menor de edad");
        }
        // SE PUEDEN EVALUAR VARIAS CONDICIONES SIMULTANEAS
        // RECORRE UNO A UNO TODOS LOS CONDICIONALES, HASTA QUE ENCUENTRE UNO QUE SE CUMPLA
        // DADO QUE SON FALSE LOS QUE INCUMPLAN LA CONDICION
        
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Introducenos por segunda vez tu edad");
        
        int edad2 = sc1.nextInt();
        
        if (edad2<18){
            System.out.println("Eres dolescente");
        }else if(edad2<40){
            System.out.println("Eres joven");
        }else if(edad2<65){
            System.out.println("Eres maduro");
        }else{
            System.out.println("Cuídate");
        }
    }
}
