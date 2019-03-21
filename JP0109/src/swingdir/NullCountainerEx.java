package swingdir;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NullCountainerEx extends JFrame{
	NullCountainerEx(){
		setTitle("��ġ������ ���� ���� ��ġ�� ��ġ�ϴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		JLabel la=new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			contentPane.add(b);
			
		}
		setSize(300);
		setVisible(true);
	}
	private void setSize(int i) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		new NullCountainerEx();
		
	}
}

