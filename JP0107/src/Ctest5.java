import java.util.Scanner;
public class Ctest5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("���� 10�� �Է� >> ");
		for(int i=0; i<=10; i++) {
			int num=sc.nextInt();
			arr[i]=num;
			if(num%3==0) {
				System.out.print(num+" ");
			}
		}
		
		
	}
}
