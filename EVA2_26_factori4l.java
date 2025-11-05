/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factori4l;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_26_factori4l {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("hii!, necesitas saber si es numero primo?.. claro, dame un numero!");
        int lim = input.nextInt();
        boolean primo = true;
        for (int i = 2; i < lim; i++){
        //division exacta...
        int residuo = lim % i;
            if(lim == 0){//cuando es 0, ya no es primo.. 
                primo = false;                break;
            }
        }
        if(primo)
            System.out.println("Parece que.. " + lim + " es primo!.. vaya. ^^");
        else
            System.out.println("Ah!.. no, parece que " + lim + " no lo es. :(");
    }
    
}
