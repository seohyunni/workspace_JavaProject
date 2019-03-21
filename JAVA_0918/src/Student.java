
public class Student {
	private int number;
	private String name;
	private int age;
	
	public Student() {
		number=100;
		name="김미림";
		age=17;
		
	}
	
	public Student(int number, String name, int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "student 의"+number+name+age+"입니다.";
	}
}
