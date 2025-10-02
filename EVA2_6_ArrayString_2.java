/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arraystring_2;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_6_ArrayString_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
        int day;
        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Say what day it is with a number (0-6): ");
        day = captu.nextInt();
        System.out.println("So, today is " + week[day]);
        
    }
    
}
