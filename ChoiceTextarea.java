package com.sathwik.Sathwikjava2;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ChoiceTextarea" width=500 height=180>
</applet>
*/
public class ChoiceTextarea extends Applet implements ItemListener,ActionListener
{

	private static final long serialVersionUID = 1L;
int a,b,c,d,z,z1;
Choice ch1,ch2,ch3,ch4,ch5,ch6,ch7;
TextField e,f,t1,t2,t3;
String msg = "";
public void init() 
{
Label l1=new Label("a ");
Label l2=new Label("gate1");
Label l3=new Label("b");
Label l4=new Label("output1 ");
Label l5=new Label("c");
Label l6=new Label("d");
Label l7=new Label("output2");
Label l8=new Label("gate2");
Label l9=new Label("finalo/p");
Label l10=new Label("gate");
setBackground(Color.pink);
setFont(new Font("SansSerif",Font.BOLD,28));
ch1 = new Choice( );
ch2 = new Choice( );
ch3 = new Choice( );
ch4 = new Choice( );
ch5 = new Choice( );
ch6 = new Choice( );
ch7 = new Choice( );
t1=new TextField( );
t2=new TextField( );
t3=new TextField( );
ch1.add("or");  
ch1.add("and");
ch1.add("not");
ch1.add("nor");
ch1.add("nand");
ch1.add("xor");


ch2.add("0");
ch2.add("1");

ch3.add("0");
ch3.add("1");
ch4.add("0");
ch4.add("1");
ch6.add("or");  
ch6.add("and");
ch6.add("not");
ch6.add("nor");
ch6.add("nand");
ch6.add("xor");

ch5.add("0");
ch5.add("1");
ch7.add("or");  
ch7.add("and");
ch7.add("not");
ch7.add("nor");
ch7.add("nand");
ch7.add("xor");

add(l1);
add(ch2);
add(l2);
add(ch1);
add(l3);
add(ch3);
add(l4);
add(t1);
add(l5);
add(ch4);
add(l8);
add(ch6);
add(l6);
add(ch5);
add(l7);
add(t2);
add(l10);
add(ch7);
add(l9);
add(t3);
ch1.addItemListener(this);
ch2.addItemListener(this);
ch3.addItemListener(this);
ch4.addItemListener(this);
ch5.addItemListener(this);
ch6.addItemListener(this);
ch7.addItemListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) 
{

repaint();
}
public void itemStateChanged(ItemEvent ie) 
{
repaint();
}

public void paint(Graphics g) 
{

msg=" ";
String x=ch1.getSelectedItem( );
String y=ch6.getSelectedItem( );
String w=ch7.getSelectedItem( );
String a=ch2.getSelectedItem( );
String b=ch3.getSelectedItem( );
String c=ch4.getSelectedItem( );
String d=ch5.getSelectedItem( );

 String e=t1.getText();
 String f=t2.getText();

if(x.equals("or"))
{
if(a.equals("0")&& b.equals("0"))
  {z=(0|0);
  t1.setText("0");
}

if(a.equals("0")&&b.equals("1"))
{
z=(0|1);
t1.setText("1"); 
}
if(a.equals("1")&&b.equals("0"))
{
z=(1|0);
t1.setText("1"); 
}

if(a.equals("1")&&b.equals("1"))
{
z=(1|1);
t1.setText("1"); 
}
}
if(x.equals("and"))
{

if(a.equals("0")&&b.equals("0"))
{
z=(0&0);
t1.setText("0"); 
}

if(a.equals("0")&&b.equals("1"))
{
z=(0&1);
t1.setText("0"); 
 }
if(a.equals("1")&&b.equals("0"))
{
z=(1&0);
t1.setText("0"); 
 } 
if(a.equals("1")&&b.equals("1"))
{
z=(1&1);
t1.setText("1"); 
 }
}

if(x.equals("xor"))
{
if(a.equals("0")&& b.equals("0"))
  {z=(0^0);
  t1.setText("0");
}

if(a.equals("0")&&b.equals("1"))
{
z=(0^1);
t1.setText("1"); 
}
if(a.equals("1")&&b.equals("0"))
{
z=(1^0);
t1.setText("1"); 
}

if(a.equals("1")&&b.equals("1"))
{
z=(1^1);
t1.setText("0"); 
}
}

/*if(x.equals("not"))
{
if(a.equals("0")&&b.equals("0"))
{ 
t1.setText("1,1");
}
if(a.equals("1")&&b.equals("1"))
{

t1.setText("0,0");
}

if(a.equals("0")&&b.equals("1"))
{ 
t1.setText("1,0");
}
if(a.equals("1")&&b.equals("0"))
{

t1.setText("0,1");
}
}*/
if(x.equals("nor"))
{
if(a.equals("0")&&b.equals("0"))
{ 
t1.setText("1");
}
if(a.equals("1")&&b.equals("1"))
{

t1.setText("0");
}

if(a.equals("0")&&b.equals("1"))
{ 
t1.setText("0");
}
if(a.equals("1")&&b.equals("0"))
{

t1.setText("0");
}

}

if(x.equals("nand"))
{
if(a.equals("0")&&b.equals("0"))
{ 
t1.setText("1");
}
if(a.equals("1")&&b.equals("1"))
{
t1.setText("0");
}
if(a.equals("0")&&b.equals("1"))
{ 
t1.setText("1");
}
if(a.equals("1")&&b.equals("0"))
{

t1.setText("1");
}
}

if(y.equals("or"))
{
if(c.equals("0")&& d.equals("0"))
  {z1=(0|0);
  t2.setText("0");
}

if(c.equals("0")&&d.equals("1"))
{
z1=(0|1);
t2.setText("1"); 
}
if(c.equals("1")&&d.equals("0"))
{
z1=(1|0);
t2.setText("1"); 
}

if(c.equals("1")&&d.equals("1"))
{
z1=(1|1);
t2.setText("1"); 
}
}
if(y.equals("and"))
{

if(c.equals("0")&&d.equals("0"))
{
z1=(0&0);
t2.setText("0"); 
}

if(c.equals("0")&&d.equals("1"))
{
z1=(0&1);
t2.setText("0"); 
 }
if(c.equals("1")&&d.equals("0"))
{
z1=(1&0);
t2.setText("0"); 
 } 
if(c.equals("1")&&d.equals("1"))
{
z1=(1&1);
t2.setText("1"); 
 }
}

if(y.equals("xor"))
{
if(c.equals("0")&& d.equals("0"))
  {z1=(0^0);
  t2.setText("0");
}

if(c.equals("0")&&d.equals("1"))
{
z1=(0^1);
t2.setText("1"); 
}
if(c.equals("1")&&d.equals("0"))
{
z1=(1^0);
t2.setText("1"); 
}

if(c.equals("1")&&d.equals("1"))
{
z1=(1^1);
t2.setText("0"); 
}
}

/*if(y.equals("not"))
{
if(c.equals("0")&&d.equals("0"))
{ 
t2.setText("1,1");
}
if(c.equals("1")&&d.equals("1"))
{

t2.setText("0,0");
}

if(c.equals("0")&&d.equals("1"))
{ 
t2.setText("1,0");
}
if(c.equals("1")&&d.equals("0"))
{

t2.setText("0,1");
}
}
if(y.equals("nor"))
{
if(c.equals("0")&&d.equals("0"))
{ 
t2.setText("1");
}
if(c.equals("1")&&d.equals("1"))
{

t2.setText("0");
}

if(c.equals("0")&&d.equals("1"))
{ 
t2.setText("0");
}
if(c.equals("1")&&d.equals("0"))
{

t2.setText("0");
}

}*/
if(y.equals("nand"))
{
if(c.equals("0")&&d.equals("0"))
{ 
t2.setText("1");
}
if(c.equals("1")&&d.equals("1"))
{
t2.setText("0");
}
if(c.equals("0")&&d.equals("1"))
{ 
t2.setText("1");
}
if(c.equals("1")&&d.equals("0"))
{

t2.setText("1");
}
}
 







if(w.equals("or"))
{
	
if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("0"))
{
  t3.setText("0");
}

}
if(e.equalsIgnoreCase("0") &&f.equalsIgnoreCase("1"))
{
t3.setText("1"); 
}
 
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("0"))
{
z=(1|0);
t3.setText("1"); 
}

if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("1"))
{
z=(1|1);
t3.setText("1"); 
}

if(w.equals("and"))
{

if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("0"))
{
z=(0&0);
t3.setText("0"); 
}

if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("1"))
{
z=(0&1);
t3.setText("0"); 
 }
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("0"))
{
z=(1&0);
t3.setText("0"); 
 } 
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("1"))
{
z=(1&1);
t3.setText("1"); 
}

}

if(w.equals("xor"))
{
	
if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("0"))
{
	z=(0^0);
  t3.setText("0");
}

if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("1"))
{
z=(0^1);
t3.setText("1"); 
}
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("0"))
{
z=(1^0);
t3.setText("1"); 
}

if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("1"))
{
z=(1^1);
t3.setText("0"); 
}
}

/*if(w.equals("not"))
{
if(e.equals("0")&&f.equals("0"))
{ 
t3.setText("1,1");
}
if(e.equals("1")&&f.equals("1"))
{

t3.setText("0,0");
}

if(e.equals("0")&&f.equals("1"))
{ 
t3.setText("1,0");
}
if(e.equals("1")&&f.equals("0"))
{

t3.setText("0,1");
}
}
if(w.equals("nor"))
{
if(e.equals("0")&&f.equals("0"))
{ 
t3.setText("1");
}
if(e.equals("1")&&f.equals("1"))
{

t3.setText("0");
}

if(e.equals("0")&&f.equals("1"))
{ 
t3.setText("0");
}
if(e.equals("1")&&f.equals("0"))
{

t3.setText("0");
}

}*/
if(w.equals("nand"))
{
if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("0"))
{ 
t3.setText("1");
}
if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("1"))
{
t3.setText("1");
}
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("0"))
{ 
t3.setText("1");
}
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("1"))
{

t3.setText("0");
}
}


if(w.equals("nor"))
{
	
if(e.equalsIgnoreCase("0")&&f.equalsIgnoreCase("0"))
{
  t3.setText("1");
}
if(e.equalsIgnoreCase("0") &&f.equalsIgnoreCase("1"))
{
t3.setText("0"); 
}
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("0"))
{
z=(1|0);
t3.setText("0"); 
}
if(e.equalsIgnoreCase("1")&&f.equalsIgnoreCase("1"))
{
z=(1|1);
t3.setText("0"); 
}
} 
}
}


