package kr.hs.emirim.page;
import java.util.*;
public class page {
	public static void main(String[] args) {
	/*public static void main(String[] args) {
	 int nPerPage=7;	
	 int result=331;
	 int ��� = result/nPerPage;
	 if(result%nPerPage!=0) {
		 ��� = result/nPerPage +1;
	 }
	System.out.println(���+" �������� �ʿ��մϴ�.");
	 int nPerPage=7;	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("�� ���� �Խù��� ǥ���ұ��? (������ ������.)");
	 int result=sc.nextInt();
	 int ��� = result/nPerPage;
	 if(result%nPerPage!=0) {
		 ��� = result/nPerPage +1;
	 }
	System.out.println(���+" �������� �ʿ��մϴ�.");
	}*/
	while(true) {
		int nPerPage=7;	
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
		int result=sc.nextInt();
		if(result==0) {
			System.out.println("��");
			break;
		}
		int ��� = result/nPerPage;
		if(result%nPerPage!=0) {
			��� = result/nPerPage +1;
		}
	
				System.out.println(���+" �������� �ʿ��մϴ�.");
	}
}
}