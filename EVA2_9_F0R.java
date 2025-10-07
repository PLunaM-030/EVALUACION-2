/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_f0r;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_9_F0R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rep;
        String mes;
        System.out.println("Message to repeat: ");
        mes = input.nextLine();
        System.out.println("So, how many times do we repeat that?");
        rep = input.nextInt();
            
            for(int i = 1; i <= rep; i++){
                System.out.print(mes);
                                            }
        
    }
    
}
