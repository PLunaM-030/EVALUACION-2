/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switchis;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_3_switchis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo  ");
         
         String dia,Lunes, Martes, Miercoles;
         dia = captu.nextLine();
         
         switch(opc){
             case "Lunes":
                 System.out.println("Has seleccionado imprimir saldo");
                 break; //break line and finish command!
             case "Martes":
                 System.out.println("Has seleccionado retiro de saldo");
                 break;
             case "Miercoles":
                 System.out.println("Has seleccionado deposito de saldo");
                 break;
             default:
                 System.out.println("!Value not found");
                    }         
        
    }
    
}