package kr.hs.emirim.page;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest11_UpDown {
	static int computer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("업앤다운");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		JTextField tfInput = new JTextField(10);
		JButton btQuestion  = new JButton("입니까?");
		
		JLabel lbResult = new JLabel("1~100사이 숫자 맞춰봐");
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//사용자입력값 가져오자
				String input = tfInput.getText();
				int player = Integer.parseInt(input);
				Random r=new Random();
				
				//컴퓨터 값과 비교
				//결과 보여주자
				if(computer >player) {
					lbResult.setText("up");
				}
				else if(computer<player) {
					lbResult.setText("down");
				}
				else {
					//결과
					//탈출
					lbResult.setText("정답입니다.");
					computer=r.nextInt(100)+1;
				}
			}
		};
		btQuestion.addActionListener(al);
		
		
		panel.add(tfInput);
		panel.add(btQuestion);
		panel.add(lbResult);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

}
