package com.sathwik.Sathwikjava2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SL extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	 int Total=0,n=0,i=0;
	 String cData,s;
	 char Data;
	 static FileReader fr;
	 JLabel IS,Tt;
	
	 static JLabel[] labels=new JLabel[20];
	 JPanel nPanel,IPanel;
	 JButton Home,Buy;
	 static SL sl;
     static FirstPageRD FPRD;
     static Thanks thanks;
     static Frame1 fm;

	 static BufferedReader brk;

	private FileInputStream fis;
	
	
	public SL(Frame1 fm1) throws IOException
	{
		fm=fm1;
		
		 n=0;
		 i=0;
		 IS = new JLabel("Items Selected");
		 
		 
		 fr= new FileReader("Data1.txt");
		  nPanel = new JPanel();           
	      nPanel.setBackground(Color.WHITE);  
	  	  nPanel.setFont(new Font("Arail",Font.BOLD,20));
	  	
	  	  
	  	   IPanel = new JPanel();              
	  	   IPanel.setBackground(Color.WHITE); 
	  	   IPanel.setFont(new Font("Arail",Font.BOLD,20));
	  	   Buy = new JButton("Buy");
	  	   Home= new JButton("Home");
	  	   Home.addActionListener(this);
	  	   Buy.addActionListener(this);
	  	   IPanel.setLayout (new BorderLayout()); 
	       IPanel.add(Buy,BorderLayout.CENTER);
	       IPanel.add(Home,BorderLayout.EAST);
	       


		 cData="";
		 Data='1';
		 
		 fis = new FileInputStream("Data1.txt");
	         
		 nPanel.setLayout (new GridLayout(10,0));
		 n=0;
	       while((i=fis.read())!=-1)
		  {
	    	   
	    	   Data=(char)i;
	    	 
			 cData=cData+Data;
			 
			 
		
			
			 if(Data=='1')
			 {
				
				
				 labels[n]   = new JLabel("                   Nokia C2-03           :          4000    Rs/-");
				 nPanel.add(labels[n]);
				 n++;
				 cData     = "";
				 Total+=4000;
			 }
			 
			 if(Data=='2')
			 {
				 labels[n]   = new JLabel("                   Nokia C5-03           :          10000   Rs/-");
				 nPanel.add(labels[n]);
				 n++;
				 cData     = "";
				 Total+=10000;
			 }
			 
			 if(Data=='3')
			 {
				 labels[n]   = new JLabel("                   Nokia Lumia           :          20000   Rs/-");
				 nPanel.add(labels[n]);
				 n++;
				 cData     = "";
				 Total+=20000;
			 }
			 
			 if(Data=='Z')
			 {
				 cData="";
			 }
			 
		 }
		 
		 Tt = new JLabel("                   Total Amount         =          "+Total+"   Rs/-");
		 
		
		
		 
		 nPanel.add(Tt);
		 
		 setLayout (new BorderLayout());
		  
		    add(nPanel, BorderLayout.CENTER);
		    add(IPanel, BorderLayout.PAGE_END);
		    setTitle("Bill");
		    setSize(1000, 500);
		    setLocationRelativeTo(null);
		 setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
	
			if(ae.getSource()==Buy)
			{
				System.exit(0);
				 
		    }
			
			if(ae.getSource()==Home)
			{
				fm.setVisible(true);
				 
		    }
				
	}



}
