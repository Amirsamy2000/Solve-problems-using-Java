/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.young.physicist;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class AYoungPhysicist {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int trial=input.nextInt();
       int x,sum_x=0;
       int y,sum_y=0;
       int z,sum_z=0;
       for(int m=0;m<trial;m++){   
          x =input.nextInt();
         y =input.nextInt();
         z =input.nextInt();
         sum_x=sum_x+x;
         sum_y=sum_y+y;
         sum_z=sum_z+z;
       }
    if(sum_x==0&&sum_y==0&&sum_z==0){
           System.out.println("YES"); 
}
    else{
        System.out.println("NO");
    }
}
    
}
