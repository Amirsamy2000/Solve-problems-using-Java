/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.capitalization;

import static com.sun.xml.internal.ws.model.RuntimeModeler.capitalize;
import java.util.Scanner;

/**
 *
 * @author N1
 */
public class WordCapitalization {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String str=null;
      str=input.nextLine();
      str=str.substring(0,1).toUpperCase()+str.substring(1);
 
        System.out.println(str);
    }
    
}
