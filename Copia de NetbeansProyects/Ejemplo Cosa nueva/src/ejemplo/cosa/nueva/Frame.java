/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cosa.nueva;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DAM 6N
 */
public class Frame extends JFrame{
int x=0,y=0;
    public Frame() {
        setTitle("Ejemplo Cosa Nueva");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        Panel p=new Panel();
        add(p);
        
    }
 
    public class Panel extends JPanel implements MouseListener{

        public Panel() {
        
        }

        public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(10, 10, 10, 10);
        }
        
        @Override
        public void mouseClicked(MouseEvent me) {
            x=me.getX();
            y=me.getY();
            repaint();
        }
        @Override
        public void mousePressed(MouseEvent me) {
            
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            
        }
        @Override
        public void mouseEntered(MouseEvent me) {
            
        }
        @Override
        public void mouseExited(MouseEvent me) {
            
        }
        
    }
    
    
}
