/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_pyr4mid;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_25_Pyr4mid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int base1;
        System.out.println("But.. oh now we want a whole pyramid.. it could work out!:");
        System.out.println("(type size)");
        base1 = input.nextInt();
        for (int i = 1; i <= base1; i++){
            for (int k = 1; k <= base1 - i; k++)//space saver
                System.out.print("");//gives us an extra space.. 
            for (int j = 1; j <= i; j++){
                System.out.print("o");}//many figures in a row
                 System.out.println();
        }
        for (int i = base1 - 1; i >= 1; i--){
            for (int k = 1; k <= base1 - i; k++)//space saver
                System.out.print("");//gives us an extra space.. 
            for (int j = 1; j <= i; j++){
                System.out.print("o");}//many figures in a row
                 System.out.println();
        }    }
}
