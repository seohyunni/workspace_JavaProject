package swingdir;

import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test001 extends JFrame{
	void Test001Ex(){
		setTitle("Let's Study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		@SuppressWarnings("unused")
		Container cp=getContentPane();
		ContentPane.setLayout();
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String args[]) {
		new Test001();
	}
	
}
