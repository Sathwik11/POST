package com.sathwik.Sathwikjava2;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thanks extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	 JLabel Thanks,fo,shopping,sp,vi;
	
	public Thanks()
	{
		Thanks = new JLabel("                        Thanks                              ");
		fo     = new JLabel("                          For                               ");
		shopping=new JLabel("                         Shopping                           ");
		sp     = new JLabel("                             ");
		vi     = new JLabel("                      Visit  Again                          ");
		setFont(new Font("Arail",Font.BOLD,20));
		setLayout (new GridLayout(5,0));
		add(Thanks);
		add(fo);
		add(shopping);
		add(sp);
		add(vi);
		
	    setTitle("Thanks");
	    setSize(1500, 1000);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

}
