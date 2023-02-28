/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.bit;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class ABit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int n=e.nextInt();
        int x=0;
        int z=0;
       for(int i=0;i<n;i++){
      String s=e.nextLine();
      if(s=="--X"){
          x--;
          
      }else if(s=="X--"){x--;}
     else if(s=="X++"){x++;}
      else {
          x++;
          
          
      }}
        System.out.println(z);
       
        
    }
    
}
