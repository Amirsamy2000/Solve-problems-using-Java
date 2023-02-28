/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.petya.and.strings;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class APetyaAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        String a=e.nextLine();
        String s=e.nextLine();
        double x=0;
        double z=0;
     a=a.toLowerCase();
     s=s.toLowerCase();
        for(int q=0;q<a.length();q++){
        x=+a.charAt(q);
        
        }
        for(int i=0;i<s.length();i++){
        z=+s.charAt(i);
        
        }
        
        
      /* for(int i=0;i<a.length();i++){
      if(a.toLowerCase().charAt(i)>s.toLowerCase().charAt(i)){
        x++;
      }
      else if(a.toLowerCase().charAt(i)<s.toLowerCase().charAt(i)){
         z++;
      }
      else if(a.toLowerCase().charAt(i)==s.toLowerCase().charAt(i)){
         q=0;
      } 
    }*/
    if(x>z){System.out.println("1");}
   else if(z>x){System.out.println("-1");}
    else{System.out.println("0");}
       
    }
    
}
