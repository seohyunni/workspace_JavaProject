package kr.hs.emirim.page;

import java.util.Random;

import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		String pae[]= {"����","����","��"};
		while(true){
		Scanner scanner=new Scanner(System.in);
		int p=1;
		if(p==0) {
			break;
		}

	int c=makeComputer();
	int result=compare(p,c);
	System.out.println("����� : "+pae[p-1]+"\t��ǻ�� : "+pae[c-1]);
	if(result==-1) {
		System.out.println("����̤�");
	}
	else if(result==0) {
		System.out.println("����.-.");
	}
	else {
		System.out.println("�̰�� />0</");
	}

	}
	}
	private static int compare(int p, int c) {
		int result=0;
		if((p==1&&c==2)||(p==2&&c==3)||(p==3&&c==1)) { //if((p+1)%3==c)
			return -1; //����ڰ� ��
		}
		if((p==1&&c==1)||(p==2&&c==2)||(p==3&&c==3)) {
			return 0; //���
		}
		else {
			return 1;
			//����ڰ� �̱�
		}
	}
	
	private static int makeComputer() {
		Random random=new Random();
		int c = random.nextInt(3-1+1)+1; //1~3������ ��
		return c;
	}
}
