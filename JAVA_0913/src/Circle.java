
public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius=10;
		pizza.name="자바피자";
		pizza.getArea();
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+ area+"입니다.");
	}
}
