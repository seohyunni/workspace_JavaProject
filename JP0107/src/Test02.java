import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.print("정수 두 개를 입력하세요. >> ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
			
		System.out.println("두 수의 합 : "+sum);
		System.out.println("두 수의 차 : "+(n1-n2));
	}
}
