/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.elephant;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class AElephant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e=new Scanner (System.in);
        int z=0;
        int x=e.nextInt();
        if(x%5==0){
        z=x/5;

        }
        else{
        z=(x/5)+1;
        }
        System.out.println(z);
    }
    
}
