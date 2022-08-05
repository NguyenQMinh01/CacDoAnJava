/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
/**
 *
 * @author E7440
 */
public class box {
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private final int SPEED = 9;
    public box() {
     ImageIcon ii = new ImageIcon("C:\\Users\\E7440\\OneDrive\\Pictures\\BlueStacks/Capture.PNG");
     image = ii.getImage();
     x = 200;
     y = 400;
 }
 public void move() {
     x += dx;
     y += dy;
   }
 
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    switch (key) {
  case KeyEvent.VK_UP:
   dy = -SPEED;
   break;
  case KeyEvent.VK_DOWN:
   dy = SPEED;
   break;
  case KeyEvent.VK_LEFT:
   dx = -SPEED;
   break;
  case KeyEvent.VK_RIGHT:
   dx = SPEED;
   break;
  }
}
  public void keyReleased(KeyEvent e) {
  int key = e.getKeyCode();
  switch (key) {
  case KeyEvent.VK_UP:
   dy = 0;
   break;
  case KeyEvent.VK_DOWN:
   dy = 0;
   break;
  case KeyEvent.VK_LEFT:
   dx = 0;
   break;
  case KeyEvent.VK_RIGHT:
   dx = 0;
   break;
  }
}
  public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}
