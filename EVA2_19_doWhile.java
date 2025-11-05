/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_dowhile;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_19_doWhile {
    final static String USER = "SargeantBunny";
    final static String PWD = "WORLDDOMINATION";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usu,contra;
        //validar
       //incorrecto, nuevo intento
       //correcto acceso
       
       do{
        System.out.println("Username:");
        usu = input.nextLine();
        
        System.out.println("Password:");
        contra = input.nextLine();
       }while(!(usu.equals(USER) && contra.equals(PWD)));
            System.out.println("WELCOME WORK, MR. FLUFFY, SIR!");
    }
    
}
