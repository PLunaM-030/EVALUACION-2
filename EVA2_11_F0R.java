/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_f0r;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_11_F0R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ini, fin, resi;
        System.out.println("Begin count: ");
        ini = input.nextInt();
        System.out.println("End: ");
        fin = input.nextInt();
        for(int i = ini; i <= fin; i++)
            resi = i % 2;//divisible entre 2
            if ( resi == 0)
            {System.out.print( i + "-");}
        
        
    }
    
}
