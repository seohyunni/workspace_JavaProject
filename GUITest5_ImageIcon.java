package kr.hs.emirim.page;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_ImageIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Á¦»ß·Î¾â ¾È³ç!");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		//ImageIcon
		ImageIcon japiroyal = new ImageIcon("src/images/japiroyal.jpg");
		JLabel imageLabel = new JLabel(japiroyal);
		
		ImageIcon ramo = new ImageIcon("src/images/ramo.png");
		//JButton imageButton = new JButton(ramo);
		
		//imageButton.setRolloverIcon(japiroyal); //¸¶¿ì½º ¿Ã¸®¸é
		//imageButton.setPressedIcon(ramo);  //Å¬¸¯ÇÏ¸é
		
		
		ImageIcon smalljapiroyal = new ImageIcon(japiroyal.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smalljapiroyal);
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
