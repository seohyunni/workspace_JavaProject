package kr.hs.emirim.page;

import java.util.Random;
import java.util.Scanner;

public class UpDownGameBot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �ּ���.");
		
		
		
		while(true){
			Random r=new Random();
			int num=r.nextInt(100);
			
			
			System.out.print(num+" UP? or DOWN? or RIGHT? >> ");
			
			String answer=sc.nextLine();
			if(answer.equals("UP")) {
				num=-num;
			}
			if(answer.equals("DOWN")) {
				num=+num;
			}
			if(answer.equals("RIGHT")) {
				System.out.println("���� �¸��Դϴ�.");
			}
		}
			
	}
}
