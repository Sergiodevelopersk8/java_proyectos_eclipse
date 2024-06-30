/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtreetest;
import javax.swing.*;
import javax.swing.tree.*;



public class JTreeTest extends JFrame{

    public JTreeTest(){
    
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Raiz");
        DefaultMutableTreeNode item1 = new DefaultMutableTreeNode("item1");
        DefaultMutableTreeNode item2 = new DefaultMutableTreeNode("item2");
        DefaultMutableTreeNode item3 = new DefaultMutableTreeNode("item3");
        DefaultMutableTreeNode item4 = new DefaultMutableTreeNode("item4");
        DefaultMutableTreeNode item5 = new DefaultMutableTreeNode("item5");
        DefaultMutableTreeNode item6 = new DefaultMutableTreeNode("item6");
        DefaultMutableTreeNode item7 = new DefaultMutableTreeNode("item7");
        DefaultTreeModel modeloTree = new  DefaultTreeModel(root);
        
        root.add(item1);
        root.add(item2);
        root.add(item3);
        root.add(item4);
        root.add(item5);
        root.add(item6);
        root.add(item7);
        
        DefaultMutableTreeNode item8 = new DefaultMutableTreeNode("item8");
        DefaultMutableTreeNode item9 = new DefaultMutableTreeNode("item9");
        item1.insert(item9,0);
        
        
        JTree arbol = new JTree(modeloTree);
    
        add(arbol);     
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        new JTreeTest();
    }
}
