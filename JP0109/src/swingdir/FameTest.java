package swingdir;

import java.awt.FlowLayout;
import java.swing.JBotton;

import javax.swing.JButton;
import javax.swing.JFrame;

//ctrl+shift+o

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	MyFrame(){
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout()); //��ġ��� ����(�⺻ 4������)
		add(new JButton("��ư��"));
		add(new JButton("��ư�� 2"));
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
