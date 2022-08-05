/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author E7440
 */
public class MyAdapter extends KeyAdapter{
 private box box;       
 public MyAdapter(box box) {
  this.box = box;
 }
 @Override
 public void keyPressed(KeyEvent e) {
  box.keyPressed(e);
 }
 @Override
 public void keyReleased(KeyEvent e) {
  box.keyReleased(e);
 }  
}
