package com.sathwik.Sathwikjava2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;


class PieChart extends JComponent {
  
	private static final long serialVersionUID = 1L;
Slice[] slices = { new Slice(5, Color.black), 
   new Slice(33, Color.green),
   new Slice(20, Color.yellow), new Slice(15, Color.red) };
   PieChart() {}
   public void paint(Graphics g) {
      drawPie((Graphics2D) g, getBounds(), slices);
   }
   void drawPie(Graphics2D g, Rectangle area, Slice[] slices) {
      double total = 0.0D;
      for (int i = 0; i < slices.length; i++) {
         total += slices[i].value;
      }
      double curValue = 0.0D;
      int startAngle = 0;
      for (int i = 0; i < slices.length; i++) {
         startAngle = (int) (curValue * 360 / total);
         int arcAngle = (int) (slices[i].value * 360 / total);
         g.setColor(slices[i].color);
         g.fillArc(area.x, area.y, area.width, area.height, 
         startAngle, arcAngle);
         curValue += slices[i].value;
      }
   }
   public static void main(String args[])
   {
	   PieChart p = new PieChart();
	   p.setVisible(true);
   }
}