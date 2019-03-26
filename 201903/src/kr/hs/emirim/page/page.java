package kr.hs.emirim.page;
import java.util.*;
public class page {
	public static void main(String[] args) {
	/*public static void main(String[] args) {
	 int nPerPage=7;	
	 int result=331;
	 int 결과 = result/nPerPage;
	 if(result%nPerPage!=0) {
		 결과 = result/nPerPage +1;
	 }
	System.out.println(결과+" 페이지가 필요합니다.");
	 int nPerPage=7;	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("몇 개의 게시물을 표시할까요? (정수로 쓰세요.)");
	 int result=sc.nextInt();
	 int 결과 = result/nPerPage;
	 if(result%nPerPage!=0) {
		 결과 = result/nPerPage +1;
	 }
	System.out.println(결과+" 페이지가 필요합니다.");
	}*/
	while(true) {
		int nPerPage=7;	
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.)");
		int result=sc.nextInt();
		if(result==0) {
			System.out.println("끝");
			break;
		}
		int 결과 = result/nPerPage;
		if(result%nPerPage!=0) {
			결과 = result/nPerPage +1;
		}
	
				System.out.println(결과+" 페이지가 필요합니다.");
	}
}
}