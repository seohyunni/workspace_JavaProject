import java.util.Scanner;
public class ScannerDemo {
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	System.out.printf("%d * %d는  %d입니다.\n",n,m,n*m);
}
}
