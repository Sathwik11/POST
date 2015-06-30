package com.sathwik.Sathwikjava2;

//Compute the future value of an investment.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
/*
<applet code="FutVal" width=380 height=240>
</applet>
*/
public class FutVal extends JApplet implements ActionListener {
	private static final long serialVersionUID = 1L;
JTextField amountText,futvalText, periodText, rateText,compText;
JButton doIt;
double principal; 
double rateOfRet; 
double numYears;  
int compPerYear;  

NumberFormat nf;

public void init() {
	try {
	SwingUtilities.invokeAndWait(new Runnable () {
	 public void run() {
	  makeGUI(); 
	}
      });
} catch(Exception exc){
	System.out.println("Can't create because of "+exc);
                      }
}

private void makeGUI() {


GridBagLayout gbag = new GridBagLayout();
GridBagConstraints gbc = new GridBagConstraints();
setLayout(gbag);

JLabel heading = new JLabel("Future value of an investment");

JLabel amountLab = new JLabel("principal");
JLabel periodLab = new JLabel("Years");
JLabel rateLab = new JLabel("Rate of returns");
JLabel futvalLab = new JLabel("Future value of investment");
JLabel compLab = new JLabel("compounding periods per year");

amountText = new JTextField(10);
periodText = new JTextField(10);
futvalText = new JTextField(10);
rateText = new JTextField(10);
compText = new JTextField(10);


futvalText.setEditable(false);
doIt = new JButton("Compute");


gbc.weighty = 1.0; 
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbc.anchor = GridBagConstraints.NORTH;
gbag.setConstraints(heading,gbc);


gbc.anchor = GridBagConstraints.EAST;

gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(amountLab,gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(amountText,gbc);

gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(periodLab,gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(periodText,gbc);

gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(rateLab,gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(rateText,gbc);

gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(compLab,gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(compText,gbc);

gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(futvalLab,gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(futvalText,gbc);

gbc.anchor = GridBagConstraints.CENTER;
gbag.setConstraints(doIt,gbc);

add(heading);
add(amountLab);
add(amountText);
add(periodLab);
add(periodText);
add(rateLab);
add(rateText);
add(compLab);
add(compText);
add(futvalLab);
add(futvalText);
add(doIt);

amountText.addActionListener(this);
periodText.addActionListener(this);
rateText.addActionListener(this);
compText.addActionListener(this);
doIt.addActionListener(this);

setSize(new Dimension(1300,500));


nf = NumberFormat.getInstance();
nf.setMinimumFractionDigits(2);
nf.setMaximumFractionDigits(2);
}


public void actionPerformed(ActionEvent ae){
	double result = 0.0;

String amountStr = amountText.getText();
String periodStr = periodText.getText();
String rateStr = rateText.getText();
String compStr = compText.getText();

try {
if(amountStr.length()!=0 && periodStr.length()!=0 && rateStr.length()!=0 && compStr.length()!=0)
	{
	principal = Double.parseDouble(amountStr);
	numYears = Double.parseDouble(periodStr);
	rateOfRet = Double.parseDouble(rateStr)/100;
	compPerYear = Integer.parseInt(compStr);

	result = compute();

	futvalText.setText(nf.format(result));
     }
      showStatus(" "); 
  } catch(NumberFormatException exc){
	showStatus("Invalid Data");
	futvalText.setText("");
    }
}


double compute() {
 double b, e;

   b = (1 + rateOfRet/compPerYear);
   e = compPerYear * numYears;

return principal * Math.pow(b, e);
}
}


 


