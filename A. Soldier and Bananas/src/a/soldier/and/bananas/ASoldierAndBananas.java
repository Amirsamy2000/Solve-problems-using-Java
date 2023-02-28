/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.soldier.and.bananas;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class ASoldierAndBananas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int k=input.nextInt();
       int n=input.nextInt();
       int w=input.nextInt();
       int t=0;
       for(int i=0;i<w;i++){
          t+=k+(k*i); 
       }
       if(n>=t){
        System.out.println(0);
       }
       else{
        System.out.println(t-n);
    }}
    
}
