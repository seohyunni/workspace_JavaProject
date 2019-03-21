import java.util.Scanner;


//Ctrl+shift+o; 자동 import
public class Test01 {
	public static void main(String[] args) {
		System.out.println("학번과 이름을 입력하세요 .");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String name=in.next();
		
		System.out.println("당신의 학번 : "+num);
		System.out.println("당신의 이름 : "+name);
		
		in.close();
	}
}
