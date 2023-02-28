/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.word;

import java.util.Scanner;

/**
 *
 * @author alame
 */
public class AWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       String word=in.next();
     int o=0,o2=0;
       for(int i=0;i<word.length();i++){
           if(Character.isUpperCase(word.charAt(i))){
           o++;
           }
           else{
           o2++;
           } 
          
          }
       if(o2>=o){word=word.toLowerCase();}
       else{word=word.toUpperCase();}
        System.out.println(word);
 
    }
    
}
