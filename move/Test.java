/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author E7440
 */
public class Test extends JFrame{

  public Test() {
  add(new MainGame());
    setSize(700, 800);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  }
   public static void main(String[] args) {
  new Test();
 }
 } 


