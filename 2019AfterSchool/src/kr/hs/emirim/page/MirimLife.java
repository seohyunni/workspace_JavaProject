package kr.hs.emirim.page;

import java.util.Scanner;

public class MirimLife {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("학번 입력 >> ");
			String number = sc.nextLine();
			System.out.println(number);
			if(number.substring(0,1).equals("1")||number.substring(0,1).equals("2")) {
				if(number.substring(1,2).equals("1")||number.substring(1,2).equals("2")) {
					System.out.println("뉴미디어소프트웨어과");
				}
				else if(number.substring(1,2).equals("3")||number.substring(1,2).equals("4")) {
					System.out.println("뉴미디어웹솔루션과");
				}
				else if(number.substring(1,2).equals("5")||number.substring(1,2).equals("6")) {
					System.out.println("뉴미디어디자인과");
				}
			}
			else if(number.substring(0,1).equals("3")) {
				if(number.substring(1,2).equals("1")||number.substring(1,2).equals("2")) {
					System.out.println("인터렉티브미디어과");
				}
				else if(number.substring(1,2).equals("3")||number.substring(1,2).equals("4")) {
					System.out.println("뉴미디어디자인과");
				}
				else if(number.substring(1,2).equals("5")||number.substring(1,2).equals("6")){
					System.out.println("뉴미디어솔루션과");
				}
						
				}
			
		
		}
		
		
	}
}
