class Point {
	private int x,y;
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}
public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		
		this.color=color;
	}
}
public void show() {
	System.out.println("x="+getX()+"y="+getY());
}
	public static void main(String args[]) {
		
		ColorPoint cp=new ColorPoint(5,5,"Yellow");
		cp.setPoint(10,20);
		cp.getColor("GREEN");
		cp.show();
		}
	}

}
