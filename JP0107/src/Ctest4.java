import java.util.Scanner;

class Phone{
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
		
	}
	public String getName() {
		return name;
		
	}
	public String getTel() {
		return tel;
	}
}
public class Ctest4 {
	public static void main(String args[]) {
		Phone p1,p2;
		Scanner sc=new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >> ");
		p1=new Phone(sc.next(), sc.next());
		System.out.print("이름과 전화번호 입력 >> ");
		p2=new Phone(sc.next(), sc.next());
		
		System.out.println(p1.getName()+"의 전번 : "+p1.getTel());
		System.out.println(p2.getName()+"의 전번 : "+p2.getTel());
	}
}
