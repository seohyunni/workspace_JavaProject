package seoul_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Seoul extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	public Seoul() {
		setTitle("Seoul Mobile Platform");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../Img/·ª¹¦Å©ÇÐ.png")).getImage();
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_HEIGHT,Main.SCREEN_WIDTH);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,  0 , 0, null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground,0,0,null);
		this.repaint();
	}
}