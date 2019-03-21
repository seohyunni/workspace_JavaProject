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
		System.out.println("¸Û¸Û Â¢´Â´Ù.");
	}
	
	void eat(String a="¸ÔÀÌ") {
		System.out.println(a+"¸¦ ¸Ô´Â´Ù.");
	}
	
}
		

public class Test01 {
	public static void main(String args[]) {
	 	Dog d=new Dog("½Ã¹Ù","1¼¼","°¥»ö");
	 	System.out.println(d.print());
	 	d.barking();
	 	d.eat();
	 	
		}
	}


}
