import java.util.*;
public class Test2 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		do {
			System.out.println("���� ������ �Է��ϼ���.");
			n=sc.nextInt();
			if(n%2==0)
			{
				sum+=n;
			}
			
			}while(n>=0);
		System.out.printf("�Է��� ���� ���� �߿��� ¦���� ���� %d",sum);
		}
}
