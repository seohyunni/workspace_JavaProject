package kr.hs.emirim.page;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//���� �Է¹���
		//�� �ڸ����� ���� ������
		//���� ���� �������
		nSum(sc);
	}

	private static void nSum(Scanner sc) {
		int sum=0;
		System.out.print("���� �Է� >> ");
		String n=sc.nextLine();
		
		int length = n.length();
		for(int i=0; i<length; i++) {
			 char num = n.charAt(i);
			sum += num-'0';
		}
		System.out.println(sum);
	}

}
