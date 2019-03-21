package swingdir;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	ContentPaneEx(){
		setTitle("ContentPane°ú JFrame ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPAne = getContentPane();
		contentPAne.setBackground(Color.ORANGE);
		contentPAne.setLayout(new FlowLayout());
		
		contentPAne.add(new JButton("OK"));
		contentPAne.add(new JButton("Cancel"));
		contentPAne.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new ContentPaneEx();
	}
}
