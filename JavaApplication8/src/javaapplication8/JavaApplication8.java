/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    static Scanner sr = new Scanner(System.in);
    public static void main(String[] args) {
  
		double length = sr.nextInt();
		String in = null;
		
		for(int i = 0; i <= length; i++)
		{
			in = sr.nextLine();
			
			if(in.length() > 10)
			{
				System.out.print(in.charAt(0));
				System.out.print(in.length() -2); 
				System.out.println(in.charAt(in.length() -1));
			}else
				System.out.println(in);
			
		}
	}


}