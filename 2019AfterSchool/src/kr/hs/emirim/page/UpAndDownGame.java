package kr.hs.emirim.page;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int randomnum=r.nextInt(100)+1;
		System.out.println("���� ������ ���ڸ� ���纸����. (0~100)");
		
		while(true) {
			System.out.print("���� >> ");
			int num=sc.nextInt();
			
			if(num==randomnum) {
				System.out.println("�����Դϴ�! ����� �¸��Դϴ�.");
				break;
			}
	
			if(num>randomnum) {
				System.out.println("DOWN");
				
			}
				
			if(num<randomnum) {
					System.out.println("UP");
					
				}
				
			}
		}
	}
