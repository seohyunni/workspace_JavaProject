import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.print("정수 하나를 입력하세요. >> ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum1=0, sum2=0;
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum2+=i;
			}
			else if(i%2==1) {
				sum1+=i;
			}
		}
		System.out.println("1부터 "+num+"까지의 홀수 합 : "+sum1);
		System.out.println("1부터 "+num+"까지의 짝수 합 : "+sum2);
	}	

}
