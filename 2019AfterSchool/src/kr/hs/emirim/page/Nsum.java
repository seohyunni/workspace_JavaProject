package kr.hs.emirim.page;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//숫자 입력받자
		//각 자릿수의 수를 더하자
		//더한 값을 출력자자
		nSum(sc);
	}

	private static void nSum(Scanner sc) {
		int sum=0;
		System.out.print("숫자 입력 >> ");
		String n=sc.nextLine();
		
		int length = n.length();
		for(int i=0; i<length; i++) {
			 char num = n.charAt(i);
			sum += num-'0';
		}
		System.out.println(sum);
	}

}
