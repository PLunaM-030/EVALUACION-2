/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captur4;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_14_CAPTUR4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tama;
        System.out.println("Numero de calificaciones a capturar: ");
        tama = input.nextInt();
        int calif[] = new int[tama];
            for(int i=0; i < calif.length; i++){
            System.out.println("Calificacion " + (i + 1) + ":");
            calif[i] = input.nextInt();
            }
        for(int i = 0; i < calif.length; i++)
            System.out.println("[" + calif[i] + "]");
        
    }
    
}
