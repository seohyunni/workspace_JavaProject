import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.print("���� �ϳ��� �Է��ϼ���. >> ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1���� "+num+"������ �� : "+sum);
	}

}
