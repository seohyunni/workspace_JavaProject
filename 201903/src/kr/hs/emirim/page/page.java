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
		//input
		int nPerPage=7;	
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
		String inputString = sc.nextLine();
		//if exit? -> exit
		if(inputString.equals("exit")) {
			System.out.println("��");
			break;
		}
		//String -> int
		int result = Integer.parseInt(inputString);
		//calculate page
		int ��� = result/nPerPage;
		if(result%nPerPage!=0) {
			��� = result/nPerPage +1;
		}
		//output
	
				System.out.println(���+" �������� �ʿ��մϴ�.");
	}
}
}