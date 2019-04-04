package kr.hs.emirim.page;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int randomnum=r.nextInt(100)+1;
		System.out.println("제가 생각한 숫자를 맞춰보세요. (0~100)");
		
		while(true) {
			System.out.print("숫자 >> ");
			int num=sc.nextInt();
			
			if(num==randomnum) {
				System.out.println("정답입니다! 당신의 승리입니다.");
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
