class Animal{
	void walk() {
		System.out.println("���� �� ����");
		
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("�� �� ����");
	}
	void sing() {
		System.out.println("�뷡�� �θ� �� ����");
	}
}
public class Test1 {
	public static void main(String args[]) {
		Bird b=new Bird();
		b.walk();
		b.fly();
		b.sing();
	}
}
