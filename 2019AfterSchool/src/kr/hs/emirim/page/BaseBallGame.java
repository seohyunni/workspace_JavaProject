package kr.hs.emirim.page;

import java.util.Random;
import java.util.Scanner;
public class BaseBallGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	//정답만들기
	//1~9까지 랜덤숫자 3번 뽑자 중복없이
//String c = "719";
	
	//무한반복
	while(true) {
	//1~9까지 세자리 숫자 입력
	String p = sc.nextLine();
	//strike, ball 구하기
	boolean isEnd = play(p,c);
	//strike == 입력한 문자열 길이만큼 나오면 hit
	if(isEnd == true) {
		System.out.println("HIT");
		break;
	}
	}
}
private static String makeComputer() {
	StringBuffer buffer = new StringBuffer();
	//1~9랜덤
	Random random = new Random();
	
	for(int i = 0; i<3; i++) {	
		int r = random.nextInt(9-1+1)+1;
		String rString = String.valueOf(r);
		//StringBuffer에 넣기 전에 있는지 확인
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
	//for i 사용자인덱스 돌고
	for(int i = 0; i<p.length(); i++) {
	//for j 컴퓨터인덱스 돌고
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
	//p, strike,ball 출력
	System.out.println(p+"\tstrike : "+strike+"\tball : "+ball);
	//p와 c가 같을 때, return true;
	if(p.equals(c)) {
		return true;
	}
	
	return false;
	}
}