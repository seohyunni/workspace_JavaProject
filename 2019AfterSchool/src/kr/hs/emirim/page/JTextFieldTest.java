package kr.hs.emirim.page;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldTest {

	public static void main(String[] args) {
		Dimension dim = new Dimension(200,100);
		
		JFrame frame = new JFrame("â�̸�");
		frame.setSize(200, 400);
		frame.setPreferredSize(dim);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		label.setText(tf.getText());
		JTextField tf = new JTextField("���̵� �Է��ϼ���.");
		tf.setText(""); //Ŭ���ϸ� �ȳ����� ����
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		
	}

}
