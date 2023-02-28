/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.task;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class StringTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        String a=s.nextLine();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
   char q=a.charAt(i);
   if(q=='a'||q=='e'||q=='u'||q=='o'||q=='y'||q=='i'){
    continue;
        }
   else
   {
       System.out.print("."+a.charAt(i));
   }
   
    
    }}
    
    
    }
        
   
        
        
   

       
    

