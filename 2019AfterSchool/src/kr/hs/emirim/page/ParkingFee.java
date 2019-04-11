package kr.hs.emirim.page;

//import java.util.Scanner;

//분을 입력받아
//최초 30분은 2000원 10분당 1000원
//주차요금 출력
//5->2000 30->2000 40->3000 41->4000
public class ParkingFee {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
	
		//while(true) {
			int fee=0;
			//분을 입력받자
			//System.out.print("주차 시간을 입력하세요. >> ");
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
			System.out.println("주차요금은 "+fee+"원 입니다.");
		
				//30분초과
				
			
			}
		
	}
}
//}
