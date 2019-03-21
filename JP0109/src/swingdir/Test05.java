package swingdir;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Test05 extends JFrame {
	Test05(){
		setTitle("FlowLayout Practice");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container cp=new Container();
						
			cp.add(new JLabel("100 + 200"));
			cp.add(new JButton(" = "));
			cp.add(new JLabel("300"));
			
			setSize(300,150);
			setVisible(true);
	

			}
	public static void main(String args[]) {
		new Test05();
	}
}
