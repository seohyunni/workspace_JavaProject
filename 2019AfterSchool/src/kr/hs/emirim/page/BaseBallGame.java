package kr.hs.emirim.page;

import java.util.Random;
import java.util.Scanner;
public class BaseBallGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	//���丸���
	//1~9���� �������� 3�� ���� �ߺ�����
//String c = "719";
	
	//���ѹݺ�
	while(true) {
	//1~9���� ���ڸ� ���� �Է�
	String p = sc.nextLine();
	//strike, ball ���ϱ�
	boolean isEnd = play(p,c);
	//strike == �Է��� ���ڿ� ���̸�ŭ ������ hit
	if(isEnd == true) {
		System.out.println("HIT");
		break;
	}
	}
}
private static String makeComputer() {
	StringBuffer buffer = new StringBuffer();
	//1~9����
	Random random = new Random();
	
	for(int i = 0; i<3; i++) {	
		int r = random.nextInt(9-1+1)+1;
		String rString = String.valueOf(r);
		//StringBuffer�� �ֱ� ���� �ִ��� Ȯ��
		//if(!buffer.toString().contains(rString)) {
		if(buffer.toString().contains(rString)==false) {
			buffer.append(rString);
			i++;
	}
		//for(int j =0; j<i;j++) {
		//	if(buffer.charAt(j)==rString.charAt(i)) {
				
			//}
		}
}
	return buffer.toString();
}

private static boolean play(String p, String c) {
	// TODO Auto-generated method stub
	int strike = 0;
	int ball = 0 ;
	//for i ������ε��� ����
	for(int i = 0; i<p.length(); i++) {
	//for j ��ǻ���ε��� ����
		for(int j = 0; j<c.length(); j++) {
	//if p[i]  == c[j]
			if(p.charAt(i)==c.charAt(j)) {
	//if i == j, strike++
				if(i==j) {
					strike++;
				}//else, ball++
				else {
					ball++;
				}
			}
		}
	}
	//p, strike,ball ���
	System.out.println(p+"\tstrike : "+strike+"\tball : "+ball);
	//p�� c�� ���� ��, return true;
	if(p.equals(c)) {
		return true;
	}
	
	return false;
	}
}