package kr.hs.emirim.page;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창");
		JLabel label = new JLabel("레이블");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
