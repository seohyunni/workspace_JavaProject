import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.print("���� �ϳ��� �Է��ϼ���. >> ");
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
		System.out.println("1���� "+num+"������ Ȧ�� �� : "+sum1);
		System.out.println("1���� "+num+"������ ¦�� �� : "+sum2);
	}	

}
