package kr.hs.emirim.page;

import java.util.Random;

import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		String pae[]= {"가위","바위","보"};
		while(true){
		Scanner scanner=new Scanner(System.in);
		int p=1;
		if(p==0) {
			break;
		}

	int c=makeComputer();
	int result=compare(p,c);
	System.out.println("사용자 : "+pae[p-1]+"\t컴퓨터 : "+pae[c-1]);
	if(result==-1) {
		System.out.println("졌당ㅜㅜ");
	}
	else if(result==0) {
		System.out.println("비겼긔.-.");
	}
	else {
		System.out.println("이겼당 />0</");
	}

	}
	}
	private static int compare(int p, int c) {
		int result=0;
		if((p==1&&c==2)||(p==2&&c==3)||(p==3&&c==1)) { //if((p+1)%3==c)
			return -1; //사용자가 짐
		}
		if((p==1&&c==1)||(p==2&&c==2)||(p==3&&c==3)) {
			return 0; //비김
		}
		else {
			return 1;
			//사용자가 이김
		}
	}
	
	private static int makeComputer() {
		Random random=new Random();
		int c = random.nextInt(3-1+1)+1; //1~3임의의 수
		return c;
	}
}
