class Dog{
	private String breed;
	private String age;
	private String color;
	
	public String setBreed() {
		return breed;
	}
	
	void setAge(String age) {
		this.age=age;
		
	}
	
	public String setColor() {
		return color;
	}
	
	public String print() {
		return breed+age+color;
	}
	
	void barking() {
		System.out.println("�۸� ¢�´�.");
	}
	
	void eat(String a="����") {
		System.out.println(a+"�� �Դ´�.");
	}
	
}
		

public class Test01 {
	public static void main(String args[]) {
	 	Dog d=new Dog("�ù�","1��","����");
	 	System.out.println(d.print());
	 	d.barking();
	 	d.eat();
	 	
		}
	}


}
