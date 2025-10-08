/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_f0rarregl0s;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_13_f0rArregl0s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arreglo[] = new int[10];
         /* arreglo[0] = 100;
          arreglo[1] = 200;
          arreglo[2] = 300;
          arreglo[3] = 400;
          arreglo[4] = 500;
          arreglo[5] = 600;
          arreglo[6] = 700;
          arreglo[7] = 800;
          arreglo[8] = 900;
          arreglo[9] = 1000;*/
         for(int i = 0; i < 10; i++){
             arreglo[i] = (int) (Math.random() * 100);} //poner numero aleatorio a nuestra variable!!
             //ahora que lea el valor
        for(int i = 0; i < 10; i++){
            System.out.print("["+arreglo[i]+"]");
    }

    }   
}
