class Circle {
	int radius;
	final double PI=3.14;
	Circle(int radius ){
		this.radius=radius;
		
	}
	double calcArea() {
		return radius*radius*PI;
	}
}

class Pizza{
	String topping;
	Pizza(String topping, int radius){
		super(radius);
		this.topping=topping;
	}
	
	public void print() {
		System.out.println("���� ���� : "+topping);
		System.out.println("���� ������ : "+radius);
		System.out.println("���� ���� : "+calcArea());
	}
	public void toString() {
		
	}
	
}
public class Test2 {
	public static void main(String args[]) {
		Pizza p=new Pizza(10,"ġ��");
		p.print();
	}
}
