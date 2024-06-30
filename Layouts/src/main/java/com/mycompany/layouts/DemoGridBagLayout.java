/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.layouts;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Draw
 */
public class DemoGridBagLayout extends JFrame{
    
    public DemoGridBagLayout() {
    
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JButton button = new JButton("Botón 1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
	c.gridy = 0;
        this.add(button, c);
        
        button = new JButton("Button 2");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	this.add(button, c);
        
        button = new JButton("Button 3");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 0;
	this.add(button, c);
        
        button = new JButton("Long-Named Button 4");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 40;      //make this component tall
	c.weightx = 0.0;
	c.gridwidth = 3;
	c.gridx = 0;
	c.gridy = 1;
	this.add(button, c);
        
        button = new JButton("5");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 0;       //reset to default
	c.weighty = 0.5;   //request any extra vertical space
	c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	c.insets = new Insets(10,0,0,0);  //top padding
	c.gridx = 1;       //aligned with button 2
	c.gridwidth = 2;   //2 columns wide
	c.gridy = 2;       //third row
	this.add(button, c);
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        
    }
    
    public static void main(String[] args) {
        new DemoGridBagLayout();
    }
    
}
