package swingdir;

import java.awt.FlowLayout;
import java.swing.JBotton;

import javax.swing.JButton;
import javax.swing.JFrame;

//ctrl+shift+o

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	MyFrame(){
		setTitle("연습용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout()); //배치모양 설정(기본 4개정도)
		add(new JButton("버튼임"));
		add(new JButton("버튼임 2"));
		setSize(300,200);
		setVisible(true);
	}
}
public class FameTest {
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		MyFrame obj=new MyFrame();
	}
}
