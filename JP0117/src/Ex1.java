import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("���� a �Է� >> ");
	int a=sc.nextInt();
	System.out.print("���� b �Է� >> ");
	int b=sc.nextInt();
	int sum=0, min=0;
	sum=a+b;
	min=a-b;
	double summin=min/sum;
	System.out.println("a-b���� a+b�� ��  : "+summin);
	}
}
