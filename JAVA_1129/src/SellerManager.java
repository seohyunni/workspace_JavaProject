import java.util.*;
public class SellerManager {
	public static void main(String[] args) {
	final int Max_Cnt=100; //100���� �����ϵ��� ������ ���ȭ ����
	
	FruitSeller[] infosave=new FruitSeller[Max_Cnt];
	int nowCnt=0;
	Scanner inpu=new Scanner(System.in);
	public  void inputData() { //�Ǹ��� ������ �Է� �޼ҵ�
		System.out.println();
		System.out.println("�����͸� �Է��ϼ���. ");
		System.out.print("���� �̸� : ");
		String name=inpu.next();
		System.out.print("��� ���� : ");
		int numOfApple=inpu.nextInt();
		System.out.println("��� ���� : ");
		int applePrice=inpu.nextInt();
		System.out.println("���� �ڱ� : ");
		int myMoney=inpu.nextInt();
		
		infosave[nowCnt++]=new FruitSeller
				(name,numOfApple,applePrice,myMoney);
		System.out.println("������ �Է� �Ϸ�!");
	}
	
	public void showData() { //����Ǿ� �ִ� ��� �Ǹ��� ���� ��� �޼ҵ�
		System.out.println();
		if(nowCnt==0) {
			System.out.println("�Էµ� �ڷᰡ �����ϴ�.");
		}
		else {
			for(int i=0; i<nowCnt; i++) {
				infosave[i].showSellerInfo();}
			
			System.out.println("���� ��ϵ� �Ǹ��� ���� "+nowCnt+" �� �Դϴ�.");
			}
		}
	}
}
