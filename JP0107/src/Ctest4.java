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
		System.out.print("�̸��� ��ȭ��ȣ �Է� >> ");
		p1=new Phone(sc.next(), sc.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է� >> ");
		p2=new Phone(sc.next(), sc.next());
		
		System.out.println(p1.getName()+"�� ���� : "+p1.getTel());
		System.out.println(p2.getName()+"�� ���� : "+p2.getTel());
	}
}
