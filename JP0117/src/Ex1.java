import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("정수 a 입력 >> ");
	int a=sc.nextInt();
	System.out.print("정수 b 입력 >> ");
	int b=sc.nextInt();
	int sum=0, min=0;
	sum=a+b;
	min=a-b;
	double summin=min/sum;
	System.out.println("a-b분의 a+b의 값  : "+summin);
	}
}
