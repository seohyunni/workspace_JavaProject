package kr.hs.emirim.page;

//import java.util.Scanner;

//���� �Է¹޾�
//���� 30���� 2000�� 10�д� 1000��
//������� ���
//5->2000 30->2000 40->3000 41->4000
public class ParkingFee {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
	
		//while(true) {
			int fee=0;
			//���� �Է¹���
			//System.out.print("���� �ð��� �Է��ϼ���. >> ");
			//int parkingMinutes = sc.nextInt();
			int parkingMinutes =52;
			//if(parkingMinutes == 0) {
			//	break;
			//}
			if(parkingMinutes<=30) {
				fee=1500;
			}else {
			parkingMinutes = parkingMinutes-30;
			fee+=1500;
			fee+=(parkingMinutes/10)*1000;
			if(parkingMinutes%10!=0) {
				fee+=1000;
			}
			System.out.println("��������� "+fee+"�� �Դϴ�.");
		
				//30���ʰ�
				
			
			}
		
	}
}
//}
