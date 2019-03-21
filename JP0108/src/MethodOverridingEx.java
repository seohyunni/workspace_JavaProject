class Shape{
	public void draw() {
		System.out.println("Shape");
		
	}
}

class Line extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {//메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle3 extends Shape{
	public void draw() {//메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { //Shape를 상속받은 객체들이 매개변수로 넘어올 수 있음 
		p.draw(); //p가 가리키는 객체에 오버라이딩 된 draw() 호출
	}
	public static void main(String args[]) {
		Line line=new Line();
		paint(line); //Line의 draw() 실행, "Line"출력
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle3());
		
	}
}
