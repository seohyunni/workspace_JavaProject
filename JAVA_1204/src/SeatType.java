import java.util.Scanner;

public class SeatType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		seatType[] seattype=new seatType[3];
		seatType[0]=new seattype("S",1);
		seatType[1]=new seattype("A",2);
		seatType[2]=new seattype("B",3);
		
		System.out.print("예약 (1), 조회(2), 취소(3), 끝내기(4)>>");
		int ans1=sc.nextInt();
		String name;
		
		if(ans1==1) {
			System.out.print("좌석 구분  S(1), A(2), B(3)");
			int ans2=sc.nextInt();
			if(ans2==1) {
				System.out.println("S>> --- --- --- --- --- --- --- --- --- ---");
				}
			else if(ans2==2) {
				System.out.println("A>> --- --- --- --- --- --- --- --- --- ---");
				
			}
			else if(ans3==3) {
				System.out.println("B>> --- --- --- --- --- --- --- --- --- ---");
				
			}
			else {
				System.out.println("ERROR");
			}
		}
		else if(ans1==2) {
			System.out.println("S>> );
		}
		
	}
}
