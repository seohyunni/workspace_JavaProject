class Circle {
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}


public class CircleArray {
	public static void main(String[] args) {
		
		Circle[] c;
		c=new Circle[5];
		
		/*c[0]=new Circle(0);
		c[1]=new Circle(1);
		c[2]=new Circle(2);
		c[3]=new Circle(3);
		c[4]=new Circle(4);
		*/
		for(int i=0; i<5; i++)
			c[i]=new Circle(i);
		
		for(int i=0; i<5; i++)
			System.out.println(c[i].getArea());
	}
}
