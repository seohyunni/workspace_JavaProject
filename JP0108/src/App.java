import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int clac();
	protected void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요. >> ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void run() {
		input();
		int res=calc();
		System.out.println("계산된 값은 "+res);
	}
}
public class App {
	public static void main(String args[]) {
		Adder a=new Adder();
		Subtracter b= new subtracter();
		a.run();
		b.run();
	}

}
