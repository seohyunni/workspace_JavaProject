package kr.hs.emirim.page;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("â");
		JLabel label = new JLabel("���̺�");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
