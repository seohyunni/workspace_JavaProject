class Circle {
	private double radius; //멤버변수를 외부로부터 은닉시킨다.
	
	public double getRadius() {
	retrun getRadius;
}
	
	public void setRadius(douvle r) {
		radius = r;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.lf, 넓이 = %.lf\n",x,y);
	}
	
public class CircleDemo1 {
	public static void main(String[] args) {
		Circle myCircle=new Circle();
		//myCircle.radius=10.0 사용할 수 없다.
		myCircle.setRedius(10.0);
		System.out.println(myCircle.radius);
	}
}
}
