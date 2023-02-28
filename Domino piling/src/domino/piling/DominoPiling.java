/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.piling;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class DominoPiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner f=new Scanner(System.in);
       int m=f.nextInt();
       int n=f.nextInt();
       int g=m*n;
        System.out.println(g/2);
      
    }
    
}
