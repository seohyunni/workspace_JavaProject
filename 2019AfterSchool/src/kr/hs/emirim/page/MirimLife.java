package kr.hs.emirim.page;

import java.util.Scanner;

public class MirimLife {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�й� �Է� >> ");
			String number = sc.nextLine();
			System.out.println(number);
			if(number.substring(0,1).equals("1")||number.substring(0,1).equals("2")) {
				if(number.substring(1,2).equals("1")||number.substring(1,2).equals("2")) {
					System.out.println("���̵�����Ʈ�����");
				}
				else if(number.substring(1,2).equals("3")||number.substring(1,2).equals("4")) {
					System.out.println("���̵�����ַ�ǰ�");
				}
				else if(number.substring(1,2).equals("5")||number.substring(1,2).equals("6")) {
					System.out.println("���̵������ΰ�");
				}
			}
			else if(number.substring(0,1).equals("3")) {
				if(number.substring(1,2).equals("1")||number.substring(1,2).equals("2")) {
					System.out.println("���ͷ�Ƽ��̵���");
				}
				else if(number.substring(1,2).equals("3")||number.substring(1,2).equals("4")) {
					System.out.println("���̵������ΰ�");
				}
				else if(number.substring(1,2).equals("5")||number.substring(1,2).equals("6")){
					System.out.println("���̵��ַ�ǰ�");
				}
						
				}
			
		
		}
		
		
	}
}
