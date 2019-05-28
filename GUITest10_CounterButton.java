package kr.hs.emirim.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUITest10_CounterButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter Button");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300,100));
		
		//JLabel, JButton
		
		
		JLabel lbNumber = new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btCount = new JButton("Click Counter");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//lbNumber에서 텍스트 가져오기
				String number = lbNumber.getText();
				int n =Integer.parseInt(number);
				String result = Integer.toString(n+1);
				lbNumber.setText(result);
				//int count = Integer.parseInt(lbNumber.getText())+1;
				//+1
				//lbNumber.setText(count+"");
				//lbNumber에 설정
				
			}
		};
		btCount.addActionListener(listener);
		
		GridLayout gl = new GridLayout(1,2);
		panel.setLayout(gl);
		
		panel.add(lbNumber);
		panel.add(btCount);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                                                                                                                                                                                                                                    

	}

}
