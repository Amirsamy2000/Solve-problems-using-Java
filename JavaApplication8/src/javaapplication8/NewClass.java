/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javax.swing.*;

/**
 *
 * @author N1
 */
public class NewClass extends JFrame {
    
    public NewClass (){
     this.setTitle("fram");
    this.setSize(500,700);
    this.setVisible(true);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel b=new JLabel();
    add(b);
    }
}
