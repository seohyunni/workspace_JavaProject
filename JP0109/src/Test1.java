class Animal{
	void walk() {
		System.out.println("걸을 수 있음");
		
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("날 수 있음");
	}
	void sing() {
		System.out.println("노래를 부를 수 있음");
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
