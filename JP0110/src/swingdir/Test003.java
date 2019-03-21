import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test003 extends JFrame{
	JButton btn; //전역변수 -> 이벤트 처리에 사용될 컴포넌트
	Test003(){
		setTitle("Action 이벤트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		//레이아웃 변경(setLayout), 컴포넌트 추가(add)
		cp.setLayout(new FlowLayout());
		btn=new JButton("Action");
		btn=setBackground(Color.PINK);
		cp.add(btn);
		
		setSize(300,100);
		setVisible(true);
}
	public static void main(String args[]) {
		new Test003();
	}

}
