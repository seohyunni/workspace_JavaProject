import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.print("���� �� ���� �Է��ϼ���. >> ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
			
		System.out.println("�� ���� �� : "+sum);
		System.out.println("�� ���� �� : "+(n1-n2));
	}
}
