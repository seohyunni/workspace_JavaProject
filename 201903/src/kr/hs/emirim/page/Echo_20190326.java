package kr.hs.emirim.page;
import java.util.*;
public class Echo_20190326 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("아무말 >> ");
			String answer=sc.nextLine();
			if(answer.equals("exit")) {
				System.out.println("끝");
				break;
			}
			
			System.out.println(answer);
			
		}
	}
}
