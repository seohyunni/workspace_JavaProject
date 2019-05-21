package kr.hs.emirim.page;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUITest4_JRadioButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		//JRadioButton
		JRadioButton nuestButton = new JRadioButton("뉴이스트");
		JRadioButton nuestwButton = new JRadioButton("뉴이스트W");
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(nuestButton);
		bg.add(nuestwButton);
		panel.add(nuestButton);
		panel.add(nuestwButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
