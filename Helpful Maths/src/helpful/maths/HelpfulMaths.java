/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpful.maths;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author N1
 */
public class HelpfulMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input =new Scanner (System.in);
      String s=input.nextLine();
      char arr[]=s.toCharArray();
      Arrays.sort(arr);
      for(int i=0;i<s.length();i++){
          if(arr[i]=='+'){
          continue;
          }
          System.out.print(arr[i]);
          if(i==s.length()-1)
              break;
            System.out.print("+");
      }
      
    }
}
