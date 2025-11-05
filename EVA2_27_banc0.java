/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_banc0;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_27_banc0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int ret;
        int cuenta = 1000000;
        do{
            System.out.println("Dinero para retirar: ");
            ret = input.nextInt();
            cuenta = cuenta - ret;
            System.out.println(cuenta);
        }while(cuenta > 0);
        System.out.println("Saldo: " + cuenta);
    }
    
}
