import java.util.*;
public class Test2 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		do {
			System.out.println("양의 정수를 입력하세요.");
			n=sc.nextInt();
			if(n%2==0)
			{
				sum+=n;
			}
			
			}while(n>=0);
		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d",sum);
		}
}
