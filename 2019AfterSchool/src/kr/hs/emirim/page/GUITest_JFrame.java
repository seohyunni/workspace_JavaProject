package kr.hs.emirim.page;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 300);
		//frame.setSize(300,400);
		//frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("������ Ǫ������~");
		//label.setOpaque(true);
		//label.setBackground(Color.pink);
		JLabel label2 = new JLabel("�츮���� �ڶ���~");
		
		JTextField tf = new JTextField("�츮���� �ڶ���~");
		
		//frame.add(label);
		panel.add(label);
		panel.add(tf);
		frame.add(label2);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
