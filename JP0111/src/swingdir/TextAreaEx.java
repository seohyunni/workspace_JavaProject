package swingdir;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	JTextField tf=new JTextField(20);
	JTextArea ta=new JTextArea(7,20);
	TextAreaEx(){
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���."));
		c.add(tf); c.add(new JScrollPane(ta));
		tf.addActionListener(new MyAction());
		setSize(300,200);
		setVisible(true);
		
	}
	class MyAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0)
		{ta.append(tf.getText()+"\n");
		tf.setText("");
		}
		}
	public static void main(String args[]) {
		new TextAreaEx();
	}

}
