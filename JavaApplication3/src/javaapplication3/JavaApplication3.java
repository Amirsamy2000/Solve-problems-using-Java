/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author alame
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int number=in.nextInt();
        int trial=in.nextInt();
     for(int i=0;i<trial;i++){
     if(number%10==0){
     number/=10;
     }
     else{
     number-=1;
     }
     }
        System.out.println(number);
    }
    
}
