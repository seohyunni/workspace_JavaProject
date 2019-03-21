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
		System.out.println("끓는 물에 라면과 스프를 넣고 2분간 끓인다.");
		}
	void taste() {
		System.out.println("개운하고 구수한 맛이 난다.");
	}
	}
public class Test3 {
	public static void main(String args[]) {
		Noodle n=new Noodle("라면");
		n.cook();
		n.taste();
	}
}
