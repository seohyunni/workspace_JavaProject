class A1{
	public A1() {
		System.out.println("생성자 A");
	}
	public A1(int x) {
		System.out.println("매개 변수가 있는 생성자 A");
	}
}

class B1 extends A1{
	public B1() {
		System.out.println("생성자 B");
	}
}
public class conEx2 {
	public static void main(String[] args) {
		B1 b=new B1();
	}
}
