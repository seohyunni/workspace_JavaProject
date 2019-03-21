class Shape{
	public void draw() {
		System.out.println("Shape");
		
	}
}

class Line extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle3 extends Shape{
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { //Shape�� ��ӹ��� ��ü���� �Ű������� �Ѿ�� �� ���� 
		p.draw(); //p�� ����Ű�� ��ü�� �������̵� �� draw() ȣ��
	}
	public static void main(String args[]) {
		Line line=new Line();
		paint(line); //Line�� draw() ����, "Line"���
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle3());
		
	}
}
