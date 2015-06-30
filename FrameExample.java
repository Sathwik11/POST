package com.sathwik.Sathwikjava2;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

 
public class FrameExample extends JFrame implements ActionListener
{
  
	private static final long serialVersionUID = 1L;

	static FirstPageRD FPRD;
	static Frame1 Frame1;
	
	FrameExample FE;
	
	JButton home,Nokia,Samsung;
	
	Label l1;
	
	JPanel bpanel,hpanel;

  FrameExample(FirstPageRD mn)
  {
	  FPRD=mn;
	  home    = new JButton("HOME");
	  Nokia    = new JButton("Nokia");
	  Samsung    = new JButton("Samsung");
	  home.addActionListener(this);
	  
	  Nokia.addActionListener(this);
	  Samsung.addActionListener(this);
    setTitle("CELL BRANDS SELECTION");
    setSize(1000, 500);
    
    l1=new Label("Brand Slection");
    
    bpanel  = new JPanel();
    bpanel.setBackground(Color.WHITE);
	    
	bpanel.setFont(new Font("Arail",Font.BOLD,20));
	
	bpanel.setLayout (new GridLayout(10,0)); 
	
	bpanel.add(l1);
	bpanel.add(Nokia);
    bpanel.add(Samsung);
    
    hpanel  = new JPanel();
    hpanel.setBackground(Color.WHITE);
	hpanel.setFont(new Font("Arail",Font.BOLD,20));
	
	hpanel.setLayout (new BorderLayout()); 
	hpanel.add(home,BorderLayout.EAST);
    
	this.setLayout(new BorderLayout());
	this.add(bpanel,BorderLayout.CENTER);
	this.add(hpanel,BorderLayout.PAGE_END); 
	
	 setLocationRelativeTo(null);
    setVisible(true); 
    
  }
 

 


public void actionPerformed(ActionEvent ae) {
    
    if(ae.getSource()==home)
	{
    	   FPRD.setVisible(true);
    	   FE.setVisible(false);
	    
    }
	
	
	if(ae.getSource()==Nokia)
	{
           try {
			Frame1=new Frame1(FPRD,FE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           FE.setVisible(false);
           FPRD.setVisible(false);
           Frame1.getClass1(Frame1);
           Frame1.setVisible(true);
	    
    }
	
	    
	if(ae.getSource()==Samsung)
	{
           try {
			Frame1=new Frame1(FPRD,FE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           FE.setVisible(false);
           FPRD.setVisible(false);
           Frame1.getClass1(Frame1);
           Frame1.setVisible(true);
	    
    }
	
}


public void getClass(FrameExample jFrame) {

	FE=jFrame;
}
}
