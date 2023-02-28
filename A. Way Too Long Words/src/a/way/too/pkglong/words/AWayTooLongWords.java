
package a.way.too.pkglong.words;

import java.util.Scanner;

public class AWayTooLongWords {

    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        
        String s=null ;
        
        int n=e.nextInt();
        
       for(int i=0;i<=n;i++)
       {
            s=e.nextLine();
            if(s.length()>10){
                System.out.print(s.charAt(0));
              System.out.print(s.length()-2);
                System.out.println(s.charAt(s.length()-1));
            }
            else
                System.out.println(s);     
            
            
        }
   
    }

   
    
}
