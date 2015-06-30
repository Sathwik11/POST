package com.sathwik.Sathwikjava2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton Nokia1,Nokia2, Nokia3,previous,home;
	 JPanel nPanel,cpanel;
	 JLabel Nokia1l,Nokia2l,Nokia3l;
	
	static Frame1 Frame1;
	static FirstPageRD FPRD;
	static FrameExample FE;
	static SL sl;
	static JButton Bill;

	FileDialog dlg;
	String str1,str2,str3,temp;
	  static FileWriter fw;
	private FileOutputStream fos;
	
	
	
	public Frame1(FirstPageRD FPRD1,FrameExample FE1) throws IOException
	{
         FPRD  = FPRD1;
         FE    = FE1;
         
         
         Bill = new JButton("Bill Summary");
         Bill.addActionListener(this);
	      nPanel = new JPanel();              // north panel will hold three button
  	    nPanel.setBackground(Color.WHITE);
  	    
  	  nPanel.setFont(new Font("Arail",Font.BOLD,20));
	    
  	  temp="Z";
	    Nokia1   = new JButton("Nokia c2-03");
	    Nokia2  = new JButton("Nokia C3-05");
	    Nokia3  = new JButton("Nokia Lumia");
	    
	    str1   = "Price : 4,000 RS/-                 Colour  :  BLACK                     WIFI                BLUTOOTH";
	    str2   = "Price : 10,000 RS/-                Colour  :  GREEN                     WIFI                BLUTOOTH";
	    str3   = "Price : 20,000 RS/-                Colour  :  WHITE                     WIFI                BLUTOOTH";
	    Nokia1l   = new JLabel("Price : 4,000 RS/-                 Colour  :  BLACK                     WIFI                BLUTOOTH");
	    Nokia2l   = new JLabel("Price : 10,000 RS/-                Colour  :  GREEN                     WIFI                BLUTOOTH");
	    Nokia3l   = new JLabel("Price : 20,000 RS/-                Colour  :  WHITE                     WIFI                BLUTOOTH");

	    Nokia1.addActionListener(this);
        Nokia2.addActionListener(this);
        Nokia3.addActionListener(this);
        
        nPanel.setLayout (new GridLayout(10,0)); 
	    nPanel.add(Nokia1);
	    nPanel.add(Nokia1l);
	    
	    nPanel.add(Nokia2);
	    nPanel.add(Nokia2l);
	    
	    nPanel.add(Nokia3);
	    nPanel.add(Nokia3l);
	    
	    previous   = new JButton("Previous");
	    home       = new JButton("Home");
	   
	    
	    previous.addActionListener(this);
        home.addActionListener(this);
	    
	    cpanel = new JPanel();              // north panel will hold three button
  	    cpanel.setBackground(Color.WHITE);
  	    
  	    cpanel.setFont(new Font("Arail",Font.BOLD,20));
  	  
  	    cpanel.setLayout (new BorderLayout()); 
	    cpanel.add(home,BorderLayout.EAST);
	    cpanel.add(previous,BorderLayout.WEST);
	    cpanel.add(Bill,BorderLayout.CENTER);
	
	    
	    this.setLayout (new BorderLayout());
	  
	    add(nPanel, BorderLayout.CENTER);
	    add(cpanel, BorderLayout.PAGE_END);
	    
	    
	    setTitle("Frame1");
	    setSize(1000, 500);
	    setLocationRelativeTo(null);
	   fos = new FileOutputStream("Data1.txt");
	    
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==home)
			{
		    	   FPRD.setVisible(true);
		    	   Frame1.setVisible(false);
		    	   
			    
		    }
			
			
			if(ae.getSource()==previous)
			{
				   FE.setVisible(true);
		    	   Frame1.setVisible(false);
			    
			    
		    }
			
			
			if(ae.getSource()==Bill)
			{
				  Frame1.setVisible(false);

				 try {
						sl=new SL(Frame1);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 sl.setVisible(true);
			         			    
		    }
			
	
			
			 if(ae.getSource()==Nokia1)
			 {
			    	  try
			    	  {
			              str1="NO1";
			    		  fos.write('N');
			    		  fos.write('O');
			    		  fos.write('1');
			    		  fos.write('Z');
			    		  
	
			    	  }
			    	   
			    	  catch(Exception e)
			    	  {
			    		  System.out.println("Exception : "+e);
			    	  }
				    
			    }
				
				
				if(ae.getSource()==Nokia2)
				{
					  try {
						  str2="NO2";
						  fos.write('N');
			    		  fos.write('O');
			    		  fos.write('2');
			    		  fos.write('Z');

					} catch (Exception e) {
						 System.out.println("Exception : "+e);
					}
		    		  
				    
				    
			    }
				
				
				if(ae.getSource()==Nokia3)
				{
					 try {
						  str3="NO3";
						  fos.write('N');
			    		  fos.write('O');
			    		  fos.write('3');
			    		  fos.write('Z');

					} catch (Exception e) {
						 System.out.println("Exception : "+e);
					}
		    		  
				    
				    
			    }
				
				
			
	}
	
	
	public void getClass1(Frame1 frame1) {

		Frame1=frame1;
	}

}


