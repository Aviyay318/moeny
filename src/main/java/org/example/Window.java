package org.example;

import javax.swing.*;

public class Window extends JFrame {
   public Window(){
       this.setSize(1100,900);
       this.setLayout(null);
       this.setTitle("Money Exchange");
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.add(new Panel());
       this.setVisible(true);
   }
}
