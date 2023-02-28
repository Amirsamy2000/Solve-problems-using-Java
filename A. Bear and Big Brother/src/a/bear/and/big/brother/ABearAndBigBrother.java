/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.bear.and.big.brother;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class ABearAndBigBrother {

    /**2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int limk=n.nextInt();
        int Big=n.nextInt(); 
   int counter=0;
      while(limk<=Big){
    limk*=3;
    Big*=2;
    counter++;
    }
        System.out.println(counter);
    }       
}
