/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botones;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class Botones extends JFrame{

	public Botones() {
	JButton b = new JButton(new ImageIcon("2099.jpg"));
	
	b.setMnemonic('c');
	
	
	b.setBounds(100,100,250,200);
	
	add(b);
	setSize(500,500);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	
	}
	
	
	
	
	public static void main(String [] args) {
		
		Botones obj = new Botones();
		
		
	}
	
	
	
	
}

