/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author E7440
 */
public class MainGame extends JPanel implements ActionListener{

 private Timer timer;
 private final int DELAY = 10;
 private box box;
 
 public MainGame() {
  setFocusable(true);
  setBackground(Color.black);
  box = new box();
  MyAdapter adapter = new MyAdapter(box);
  addKeyListener(adapter);
  timer = new Timer(DELAY, this);
  timer.start();
 }
 @Override
 protected void paintComponent(Graphics g) {
  super.paintComponent(g);
  g.drawImage(box.getImage(), box.getX(), box.getY(), this);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
  box.move();
  repaint();
 }
}
    
