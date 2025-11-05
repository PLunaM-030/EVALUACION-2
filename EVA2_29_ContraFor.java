/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contrafor;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_29_ContraFor {
    //let's say these are our necessary information, that cannot change..
    final static String psw = "Goldenknight1";
    final static String User = "Jin_Miller";    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //the user may have only 4 attempts
        Scanner input = new Scanner (System.in);
        String pass, us;
        boolean Access = false;
            for(int i = 1; i < 4; i++){
                System.out.println("Username!, pleass!");
                us = input.nextLine();
                System.out.println("PASSWORD!");
                pass = input.nextLine();
                
                if(us.equals(User)&&pass.equals(psw)){
                    Access = true;
                        break;
                }
            }
        if (Access = true){
                System.out.println("Welcome Hooome~");}
    }
    
}
