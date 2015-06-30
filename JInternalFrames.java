import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class JInternalFrames extends JFrame 
{
String flags[] = { "Background_1", "Background_2", "Background_3", "Background_4", 
		"Background_5", "Background_6", "Background_7", "Background_8", "Background_9"
		, "Background_10", "Background_11", "Background_12", "Background_13", "Background_14"
		, "Background_15", "Background_16", "Background_17", "Background_18"};
public JInternalFrames() 
{
super("ID Card Generator");
//WindowUtilities.setNativeLookAndFeel();

setDefaultCloseOperation(EXIT_ON_CLOSE);
Container content = getContentPane();
JDesktopPane desktop = new JDesktopPane();
desktop.setBackground(Color.LIGHT_GRAY);
content.add(desktop, BorderLayout.CENTER);
setSize(1010, 720);

//Menubar -- File, Edit, View ,Tools and Help Menus
JMenuBar menubar = new JMenuBar();

/*ImageIcon ii2 = new ImageIcon("newicon.png");
ImageIcon ii3 = new ImageIcon("openicon.png");
ImageIcon ii4 = new ImageIcon("saveicon.png");
ImageIcon ii7 = new ImageIcon("exit.png");*/


JMenu file = new JMenu("File");
file.setMnemonic(KeyEvent.VK_F);

JMenuItem fileNew = new JMenuItem("New");
fileNew.setMnemonic(KeyEvent.VK_N);
fileNew.setToolTipText("New File");
fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
ActionEvent.CTRL_MASK));
fileNew.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
	//
}
});

JMenuItem fileOpen = new JMenuItem("Open");
fileOpen.setMnemonic(KeyEvent.VK_O);
fileOpen.setToolTipText("Open File");
fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
ActionEvent.CTRL_MASK));
fileOpen.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenuItem fileSave = new JMenuItem("Save");
fileSave.setMnemonic(KeyEvent.VK_O);
fileSave.setToolTipText("Open File");
fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
ActionEvent.CTRL_MASK));
fileSave.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});


JMenuItem fileClose = new JMenuItem("Close");
fileClose.setMnemonic(KeyEvent.VK_C);
fileClose.setToolTipText("Exit application");
fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
ActionEvent.ALT_MASK));
fileClose.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
System.exit(0);
}
});

JMenu edit = new JMenu("Edit");
edit.setMnemonic(KeyEvent.VK_F);

JMenuItem editCopy = new JMenuItem("Copy");
editCopy.setMnemonic(KeyEvent.VK_C);
editCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
ActionEvent.CTRL_MASK));
editCopy.setToolTipText("Copy");
editCopy.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenuItem editPaste = new JMenuItem("Paste");
editPaste.setMnemonic(KeyEvent.VK_V);
editPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
ActionEvent.CTRL_MASK));
editPaste.setToolTipText("Paste");
editPaste.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenuItem editCut = new JMenuItem("Cut");
editCut.setMnemonic(KeyEvent.VK_C);
editCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
ActionEvent.CTRL_MASK));
editCut.setToolTipText("Cut");
editCut.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenu view = new JMenu("View");
view.setMnemonic(KeyEvent.VK_F);

JMenuItem viewToolbar = new JMenuItem("Toolbar");
viewToolbar.setMnemonic(KeyEvent.VK_C);
viewToolbar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
ActionEvent.CTRL_MASK));
viewToolbar.setToolTipText("Toolbar");
viewToolbar.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenu tools = new JMenu("Tools");
tools.setMnemonic(KeyEvent.VK_F);

JMenuItem toolsPhoto = new JMenuItem("Photo from file");
toolsPhoto.setMnemonic(KeyEvent.VK_C);
toolsPhoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
ActionEvent.CTRL_MASK));
toolsPhoto.setToolTipText("Photo from file");
toolsPhoto.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JMenu help = new JMenu("Help");
help.setMnemonic(KeyEvent.VK_F);

JMenuItem helpHelp = new JMenuItem("Help");
helpHelp.setMnemonic(KeyEvent.VK_C);
helpHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
ActionEvent.CTRL_MASK));

helpHelp.setToolTipText("Help");
helpHelp.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

file.add(fileNew);
file.add(fileOpen);
file.add(fileSave);
file.add(fileClose);
edit.add(editCopy);
edit.add(editPaste);
edit.add(editCut);
view.add(viewToolbar);
tools.add(toolsPhoto);
help.add(help);

menubar.add(file);
menubar.add(edit);
menubar.add(view);
menubar.add(tools);
menubar.add(help);
setJMenuBar(menubar);

//Toolbars --> Horizontal Toolbar and Vertical Toolbar
//Horizontal Toolbar
JToolBar toolbar = new JToolBar();
toolbar.setFloatable(false);

ImageIcon imageicon1= new ImageIcon("toolbar1_new.png");
ImageIcon imageicon2= new ImageIcon("toolbar1_search.png");
ImageIcon imageicon3= new ImageIcon("toolbar1_print.png");
ImageIcon imageicon4=new ImageIcon("toolbar1_exit2.png");

JButton button1 = new JButton(imageicon1);
button1.setToolTipText("Create New File");
button1.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
	//
}
});

JButton button2 = new JButton(imageicon2);
button2.setToolTipText("Search");
button2.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JButton button3 = new JButton(imageicon3);
button3.setToolTipText("Print");
button3.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//System.exit(0);
}
});

JButton button4 = new JButton(imageicon4);
button4.setToolTipText("Exit");
button4.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
System.exit(0);
}
});

add(toolbar, BorderLayout.NORTH);

toolbar.add(button1);
toolbar.add(button2);
toolbar.add(button3);
toolbar.add(button4);

//Vertical Toolbar
JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
vertical.setFloatable(false);
vertical.setMargin(new Insets(5, 5, 5, 5));

ImageIcon imageicon7 = new ImageIcon("toolbar2_color.png");
ImageIcon imageicon5 = new ImageIcon("toolbar2_text.png");
ImageIcon imageicon6 = new ImageIcon("toolbar2_photo.png");

JButton jb4 = new JButton(imageicon5);
jb4.setBorder(new EmptyBorder(3, 0, 3, 0));
jb4.setToolTipText("Add Text");
jb4.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
}
});

JButton jb5 = new JButton(imageicon7);
jb5.setBorder(new EmptyBorder(3, 0, 3, 0));
jb5.setToolTipText("Add Color");
jb5.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
	//
}
});

JButton jb6 = new JButton(imageicon6);
jb6.setBorder(new EmptyBorder(3, 0, 3, 0));
jb6.setToolTipText("Add Photo");
jb6.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
//
}
});

vertical.add(jb4);
vertical.add(jb5);
vertical.add(jb6);

add(vertical, BorderLayout.WEST);



//Internal Frames --> Card Frame, Properties Frame and Backg
//Card Frame
JInternalFrame frame1 = new JInternalFrame(("Card Frame"),true, true, true, true);
frame1.setLocation(350, 40);
frame1.setSize(300, 300);
frame1.setBackground(Color.CYAN);
desktop.add(frame1);
frame1.moveToFront();
frame1.setVisible(true);

ImageIcon  imageicon10 = new ImageIcon("idgen_background6.png");
JButton button5 = new JButton(imageicon10);
button5.setBounds(10,50,50,50);
frame1.add(button5);

//Properties Frame
JInternalFrame frame2 = new JInternalFrame(("Properties Frame"),true, true, true, true);
frame2.setLocation(10, 450);
frame2.setSize(200, 150);
frame2.setBackground(Color.YELLOW);
desktop.add(frame2);
frame2.moveToFront();
frame2.setVisible(true);

JPanel panel1 = new JPanel();
panel1.setLayout(null);
panel1.setBackground(Color.YELLOW);
frame2.add(panel1);

JLabel label1=new JLabel("Enter the Card Size:");
label1.setBounds(10,05,200,10);

JLabel label3=new JLabel("Width:");
label3.setBounds(10,05,200,100);

JLabel label2=new JLabel("Height:");
label2.setBounds(10,25,200,100);

JTextField textfield1=new JTextField();
textfield1.setBounds(50,45,100,20);

JTextField textfield2=new JTextField();
textfield2.setBounds(50,65,100,20);

JButton bok = new JButton("OK");
bok.setBounds(60,90,60,20);

panel1.add(label1);
panel1.add(label2);
panel1.add(label3);
panel1.add(textfield1);
panel1.add(textfield2);
panel1.add(bok);


//Background Frame
final JInternalFrame frame3 = new JInternalFrame(("Background Frame"),true, true, true, true);
frame3.setLocation(10, 10);
frame3.setSize(200, 150);
frame3.setBackground(Color.WHITE);
desktop.add(frame3);
frame3.moveToFront();
frame3.setVisible(true);

JPanel panel3 = new JPanel();
panel3.setLayout(null);
panel3.setBackground(Color.CYAN);
frame3.add(panel3);

JLabel label5=new JLabel("Select Background of Card:");
label5.setBounds(10,05,200,20);
panel3.add(label5);

final JComboBox combobox1=new JComboBox(flags);
combobox1.setBounds(30,40,120,20);
panel3.add(combobox1);

JButton bapply = new JButton("Apply");
bapply.setBounds(55,90,68,20);
bapply.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent event) 
{
	String s = (String) combobox1.getSelectedItem();
	
	String s1="Background_1";
	String s2="Background_2";
	String s3="Background_3";
	String s4="Background_4";
	String s5="Background_5";
	if(s.equals(s1))
	{
		JFrame frame = new JInternalFrames();
		frame.setVisible(true);
	}
	if(s.equals(s2))
	{
		JFrame frame = new JInternalFrames();
		frame.setVisible(true);
	}
	if(s.equals(s3))
	{
		JFrame frame = new JInternalFrames();
		frame.setVisible(true);
	}
	if(s.equals(s4))
	{
		JFrame frame = new JInternalFrames();
		frame.setVisible(true);
	}
	if(s.equals(s5))
	{
		JFrame frame = new JInternalFrames();
		frame.setVisible(true);
	}
}
});
panel3.add(bapply);




}

public static void main(String[] args) 
{
JFrame frame = new JInternalFrames();
frame.setVisible(true);
}

}