/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_foor;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_12_FOOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1, mult;
        
        System.out.println("Good morn' lad!");
        
        System.out.println("i'd like to have one number, please, so we can make the multiplication table, from 1 to 10!");
            n1 = input.nextInt();
        System.out.println("Thanks!, wait, this may take a while....");
            for (int i = n1; i <= 10; i++){
               mult = n1 * i;
                System.out.print( n1 + "x" + i + "=" + mult);}
                System.out.println("");
       
        
    }
    
}
