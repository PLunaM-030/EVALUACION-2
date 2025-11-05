/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_tri4ngle;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_24_tri4ngle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        //GOOD EVENING, WE NEED A TRIANGLE SO BADLY, SO WE MUST ASK YOU FOR ONE.
        int baseCount;
        System.out.println("We want a triangle.. can you do it, THIS big?:");
        System.out.println("(type size)");
        baseCount = input.nextInt();
        for (int i = 1; i <= baseCount; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("🔺");}
        }
    }
    
}
