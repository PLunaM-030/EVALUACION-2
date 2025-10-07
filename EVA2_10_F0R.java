/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_f0r;

import java.util.Scanner;

/**
 *
 * @author pawlu
 */
public class EVA2_10_F0R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //let's count to 20!!
    for(int i = 1; i <= 20; i++){
        System.out.print(i + "-");
        }
    
        System.out.println("");
        
    for (int i = 0; i <= 100; i+=2){
        System.out.print(i + "-");}
    
        System.out.println("");
        
    for(int i = 20; i >= 1; i--){
        System.out.print(i + "_");}
    
        System.out.println("");
        
    for(int i = 100; i >= 0; i-=2 ){
        System.out.print(i + "_");}
    
     //  // //numbers between the two values the user places down here.
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Give me two numbers to make your count.");
        int num1,num2;
        System.out.println("Num 1: "); num1 = input.nextInt();
        System.out.println("Num 2: "); num2 = input.nextInt();
        System.out.println("");
            for(int i = num1; i <= num2; i++){
                System.out.print(i + "..");}
    //  //  //MULTIPLICATION ATTENTION!!!
        System.out.println("");
        System.out.println("Now that we have all this stuff, we're going to print your multiplication table.");
        int v1;
        System.out.println("Number of table: ");
        v1 = input.nextInt();
            for(int i = v1; i <= v1*10; i*=v1 ){
                System.out.println(i + " x ");}
    }
    
}
