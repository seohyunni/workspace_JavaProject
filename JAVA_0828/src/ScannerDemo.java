import java.util.Scanner;
public class ScannerDemo {
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	System.out.printf("%d * %d��  %d�Դϴ�.\n",n,m,n*m);
}
}
