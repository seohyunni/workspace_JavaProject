class Circle {
	private double radius; //��������� �ܺηκ��� ���н�Ų��.
	
	public double getRadius() {
	retrun getRadius;
}
	
	public void setRadius(douvle r) {
		radius = r;
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.lf, ���� = %.lf\n",x,y);
	}
	
public class CircleDemo1 {
	public static void main(String[] args) {
		Circle myCircle=new Circle();
		//myCircle.radius=10.0 ����� �� ����.
		myCircle.setRedius(10.0);
		System.out.println(myCircle.radius);
	}
}
}
