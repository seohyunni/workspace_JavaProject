import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		System.out.print("���� �ϳ��� �Է��ϼ���. >> ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
