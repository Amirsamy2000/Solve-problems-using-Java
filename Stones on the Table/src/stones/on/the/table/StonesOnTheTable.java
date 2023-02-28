/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stones.on.the.table;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class StonesOnTheTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);  
       int number=input.nextInt();
      String  color=input.next();
      int count =0;
       for(int i=0;i<color.length()-1;i++){
       if(color.charAt(i)!=color.charAt(i+1)){
       count++;
       }

       }
        System.out.println(count);
    }
    
}
