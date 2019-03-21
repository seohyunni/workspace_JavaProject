abstract class Food{
	String foodName;
	Food(String foodName){
		this.foodName=foodName;
	}
	void setter(String fn) {
		this.foodName=fn;
	}
	
	String getter() {
		return this.foodName;
	}
	abstract void cook();
	abstract void taste();
}

class Noodle extends Food{
	Noodle(String foodName){
		super(foodName);
	}
	void cook() {
		System.out.println("���� ���� ���� ������ �ְ� 2�а� ���δ�.");
		}
	void taste() {
		System.out.println("�����ϰ� ������ ���� ����.");
	}
	}
public class Test3 {
	public static void main(String args[]) {
		Noodle n=new Noodle("���");
		n.cook();
		n.taste();
	}
}
