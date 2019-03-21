import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.print("정수를 2개 입력하세요. >> ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=0;
		
		if(a>b) { int temp=a; a=b; b=temp;
		}
		
		int i;
		for(i=a;i<=b;i++) {
			s+=i;
			if(s>100)break;
		}
		
}
