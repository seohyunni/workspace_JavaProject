import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test003 extends JFrame{
	JButton btn; //�������� -> �̺�Ʈ ó���� ���� ������Ʈ
	Test003(){
		setTitle("Action �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		//���̾ƿ� ����(setLayout), ������Ʈ �߰�(add)
		cp.setLayout(new FlowLayout());
		btn=new JButton("Action");
		btn=setBackground(Color.PINK);
		cp.add(btn);
		
		setSize(300,100);
		setVisible(true);
}
	public static void main(String args[]) {
		new Test003();
	}

}
