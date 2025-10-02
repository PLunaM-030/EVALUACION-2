/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglosstringg;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_5_ArreglosSTRINGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String week[] = new String[7];
        int day;
        week[0]="Sunday";
        week[1]="Monday";
        week[2]="Tuesday";
        week[3]="Wednesday";
        week[4]="Thursday";
        week[5]="Friday";
        week[6]="Saturday";
        System.out.println("So, what day is it? write from 0-6: ");
        day =input.nextInt();
        System.out.println("The day is " + week[day]);
    }
    
}
