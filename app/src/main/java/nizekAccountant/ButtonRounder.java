/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nizekAccountant;

/**
 *
 * @author Lenovo
 */
//second button rounder

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author Lenovo
 */
public class ButtonRounder implements Border{
    
    public int radius;


    ButtonRounder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
