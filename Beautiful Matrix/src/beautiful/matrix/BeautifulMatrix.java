/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautiful.matrix;

import java.util.Scanner;

/**
 *
 * @author N1
 */
public class BeautifulMatrix {

   
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int ar[][]=new int [5][5];
        int z=0;
    for(int c=0;c<5;c++){
    for(int r=0;r<5;r++){
    ar[c][r]=e.nextInt();
    if(ar[c][r]==1){
        if(r<=2&&c>=2){
        z=c-r;
        }
        else if (r>=2&&c<2){
        z=r-c;
        }
        else{
        z=4-(r+c);
        }
    }
    }}
        System.out.println(Math.abs(z));
}}
