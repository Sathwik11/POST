package com.sathwik.Sathwikjava2;
import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

 class FirstPageRD extends JFrame implements ActionListener
{

	 private static final long serialVersionUID = 1L;
			JMenuBar mb;
            JMenu filemenu,editmenu,viewmenu;
            JMenuItem open,newmi,save,cut,copy;
            JCheckBoxMenuItem toolbar,layer;
            JPanel nPanel, sPanel, cPanel, bcPanel;
      	    JButton one, two, three, four, five, six,b1,b2;
      	    JLabel bottom,l1,l2;
      	    JTextField tf1,tf2;
      	    
      	    static FirstPageRD FPRD;
      	    static FrameExample FE;
      	  

public FirstPageRD() throws IOException
{
	         
	      CloseMe cm=new CloseMe();
	      addWindowListener(cm);
            mb=new JMenuBar();
            setJMenuBar(mb);
            filemenu=new JMenu("File");
            editmenu=new JMenu("Edit");
            viewmenu=new JMenu("View");

            open=new JMenuItem("Open");
            newmi=new JMenuItem("New");
            save=new JMenuItem("Save");
            cut=new JMenuItem("Cut");
            copy=new JMenuItem("Copy");

            toolbar=new JCheckBoxMenuItem("Toolbar",true);
            layer=new JCheckBoxMenuItem("Layer Window",false);

            filemenu.add(open);
            filemenu.add(newmi);
            filemenu.add(save);

            editmenu.add(cut);
            editmenu.add(copy);

            viewmenu.add(toolbar);
            viewmenu.add(layer);
            setLayout (new GridLayout(0, 1)); 
            mb.add(filemenu);
            mb.add(editmenu);
            mb.add(viewmenu);
            
     
            
            nPanel = new JPanel();              // north panel will hold three button
    	    nPanel.setBackground(Color.WHITE);
    	    
    	    nPanel.setFont(new Font("Arail",Font.BOLD,20));
    	    
    	    one    = new JButton("Mobiles");
    	    two    = new JButton("Trousers");
    	    three  = new JButton("Laptops");
    	    
            one.addActionListener(this);
            two.addActionListener(this);
            three.addActionListener(this);
            
    	    nPanel.setLayout (new GridLayout(15,0)); 
    	    nPanel.add(one);
    	    nPanel.add(two);
    	    nPanel.add(three);
    	    
    	    
    	    sPanel = new JPanel();       
    	    sPanel.setBackground(Color.white);
    	    sPanel.setFont(new Font("Courier New", Font.ITALIC, 500));
    	    bottom = new JLabel("Welcome to  PRASANNA  Retail Shopping Mall");
    	    
    	    sPanel.setLayout (new FlowLayout(FlowLayout.CENTER));
    	    sPanel.add (bottom);
    	    
    	    cPanel  = new JPanel();     
    	    bcPanel = new JPanel();     
    	    bcPanel.setBackground(Color.ORANGE);
    	   
    	   bcPanel.setFont(new FontUIResource(new Font("Arial",10, 100)));
    	    	   
    	    l1 = new JLabel("User Name");
    	    l2 = new JLabel("Password");
    	   
    	    tf1 = new JTextField(20);
    	    tf2 = new JTextField(20);
    	    
    	    b1 = new JButton("Sign in");
    	    b2 = new JButton("Create an Account");
    	    
    	    
    	    bcPanel.setLayout (new GridLayout(3,2)); 
    	    bcPanel.add(l1);
    	    bcPanel.add(tf1);
    	    bcPanel.add(l2);
    	    bcPanel.add(tf2);
    	    
    	    bcPanel.add(b1).setBounds(5, 5, 100, 10);
    	    bcPanel.add(b2);
    	
    	    
    	   
    	    cPanel.setLayout(new FlowLayout());
    	   
    	    cPanel.add(bcPanel);
    	    
    	    this.setLayout (new BorderLayout());
    	    
    	    
    	    add(sPanel, BorderLayout.NORTH);
    	    add(nPanel, BorderLayout.BEFORE_LINE_BEGINS);
    	    add(cPanel, BorderLayout.EAST);
       
}


public static void main(String s[]) throws IOException
{
           FPRD=new FirstPageRD();
           FPRD.setSize(new Dimension(1000,500));
           FPRD.setTitle("FirstPage");
           FPRD.setLocationRelativeTo(null);
           FPRD.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==one)
	{
           FE=new FrameExample(FPRD);
           FPRD.setVisible(false);
           FE.getClass(FE);
           FE.setVisible(true);
	    
    }
	
	
	if(ae.getSource()==two)
	{
           FE=new FrameExample(FPRD);
           FPRD.setVisible(false);
           FE.getClass(FE);
           FE.setVisible(true);
	    
    }
	
	
	if(ae.getSource()==three)
	{
           FE=new FrameExample(FPRD);
           FPRD.setVisible(false);
           FE.getClass(FE);
           FE.setVisible(true);
	    
    }
	    
}
}
class CloseMe extends WindowAdapter
{
	public void windowClosing(WindowEvent me)
	{
		System.exit(0);
	}
}
