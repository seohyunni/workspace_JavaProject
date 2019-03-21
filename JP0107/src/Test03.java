import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		System.out.print("정수 하나를 입력하세요. >> ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}

}
