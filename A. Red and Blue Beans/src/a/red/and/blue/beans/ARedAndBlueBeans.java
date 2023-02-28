/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.red.and.blue.beans;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class ARedAndBlueBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int test_case=input.nextInt();
         for(int i=0;i<test_case;i++){
         int red=input.nextInt();
         int blue=input.nextInt();
         int max=input.nextInt();
 if(red==blue&&max==0){
 System.out.println("YES");
 }
 else if (red==1&&max==1){ System.out.println("NO");}
 else if (red==1&&max==1){ System.out.println("NO");}
 else if(red!=blue&&max==0){System.out.println("NO");}
else if(red>blue&&red%blue==0){
int n=red/blue;
if((n-1)<=max){System.out.println("YES");}
else{System.out.println("NO");}
}
else if(red>blue&&red%blue!=0){
int n=red/blue;

if((n-1)<=max){System.out.println("YES");}
else{System.out.println("NO");}
}   
else if (blue>red&&blue%red==0){
int n=red/blue;
if((n-1)<=max){System.out.println("YES");}
else{System.out.println("NO");}

}
else{
    int n=red/blue;
int m=n;
if((n-1)<=max){System.out.println("YES");}
else{System.out.println("NO");}
}

    }
    }
    
}
