package kr.hs.emirim.page;

import java.util.Scanner;

public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��¥ �Է� >> ");
		int day = sc.nextInt();
		switch(day%7) {
		case 1 : System.out.println("������");
				break;
		case 2 : System.out.println("ȭ����");
				break;
		case 3 : System.out.println("������");
				break;
		case 4 : System.out.println("�����");
				break;
		case 5 : System.out.println("�ݿ���");
				break;
		case 6 : System.out.println("�����");
				break;
		case 0 : System.out.println("�Ͽ���");
				break;
		}
	}
}
