import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Mainframe extends JPanel{
	
	public Mainframe(){
		setLayout(new BorderLayout());
		add(tap(),BorderLayout.NORTH);
		
		
		
	
	}
	public JPanel tap(){
		JPanel tap = new JPanel();
		tap.setLayout(new FlowLayout());
		tap.setBackground(Color.black);
		tap.setPreferredSize(new Dimension(20,190));
		tap.add(menubar1());
		tap.add(tap2());
		tap.add(button3());
		tap.add(name());
		
		return tap;
	}
	
	
	
	public JPanel tap2(){
		JPanel tap2 = new JPanel();
		tap2.setLayout(new GridLayout(2,1,3,3));
		tap2.add(button1());
		tap2.add(button2());
		
		
		return tap2;
	}
	public JLabel name(){
		JLabel name = new JLabel();
		name.setText("     Champ and Aom     ");
		name.setForeground(Color.WHITE);
		
		
		return name;
	}
	
	
	
	public JButton button1(){
		JButton button = new JButton("Generite");
		
		return button;
	}
	
	public JButton button2(){
		JButton button = new JButton("Function log");
		
		return button;
	}
	
	public JButton button3(){
		JButton button = new JButton("Save");
		
		return button;
	}
	
	public JMenuBar menubar1(){
		JMenuBar menubar = new JMenuBar();
		JMenu file1 = new  JMenu("Color"); 
		JMenu file2 = new  JMenu("Quality");
		JMenuItem rgb = new JMenuItem("RGB");
		JMenuItem bw = new JMenuItem("BW");
		JMenuItem low = new JMenuItem("LOW");
		JMenuItem medium = new JMenuItem("MEDIUM");
		JMenuItem high = new JMenuItem("HIGH");
		file1.setPreferredSize(new Dimension(50,20));
		file1.add(rgb);
		file1.add(bw);
		file2.add(low);
		file2.add(medium);
		file2.add(high);
		menubar.add(file1);
		menubar.add(file2);
		
		
		
		return menubar;
		
		
	}
	
	
	
	
	
	

}
