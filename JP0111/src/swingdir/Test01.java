package swingdir;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test01 extends JFrame{
	JButton b=new JBotton(); JLabel la=new Label();
	JTextField tx1=new JTextField("",5); JTextField tx2=new JTextField("",20);
	
	Test01(){
		setTitle("������ ų�ι��ͷ� ��ȯ�ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(new GridLayout(3,1));
		JPanel pan=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		pan.add(new JLabel("�Ÿ��� ���ϴ����� �Է� : "));
		tfInput=new JTextField(5);
		pan.add(tfInput);
		ifResult=new JTextField(10);
		btn=new JButton("��ȯ");
		p2.add(btn);
		p3.add(tfResult);
		cp.add(pan); cp.add(p2); cp.add(p3);
		
		ContentPane.setLayout();
		setSize(300,200);
		setVisible(true);
				
	}
	class MyAction implements Test01{
		public void actionperformed(ActionEvent e) {
			int mile=Integer.parseInt(tfInput.getText());
			tfResult.setText(mile+"������ "+(mile*1.6)+"Km");
		}
	}
	public static void main(String args[]) {
	new Test01();	
	}
}
