package kr.hs.emirim.page;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldTest {

	public static void main(String[] args) {
		Dimension dim = new Dimension(200,100);
		
		JFrame frame = new JFrame("창이름");
		frame.setSize(200, 400);
		frame.setPreferredSize(dim);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		label.setText(tf.getText());
		JTextField tf = new JTextField("아이디를 입력하세요.");
		tf.setText(""); //클릭하면 안내문구 지움
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		
	}

}
