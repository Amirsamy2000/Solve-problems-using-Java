/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.boy.or.girl;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class ABoyOrGirl {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int c;
      int count=0;
        for(int i=0;i<str.length()-1;i++){   
           
        for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
            count++;
            break;
           
        }
        
        }}
      c=str.length()-count;
  //  System.out.println(count);
      
     
       
        if(c%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");}
       
    }
    
    } 

