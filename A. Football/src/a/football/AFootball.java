/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.football;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class AFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String postion=input.next();
         int count =1;
         
         for(int i=0;i<postion.length()-1;i++){
         if(postion.charAt(i)==postion.charAt(i+1)){{
             count++;
             if(count==7)
             {
             break;
             }
             
         }}
         else{
             count=1;}
         }
         if(count>=7){System.out.println("YES");}
         else{System.out.println("NO");}
         
         
    }
    
}
