package app;

class point{
	int x, y;
	public point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+", "+y+")";
	}
}
public class Test1 {
	public static void main(String args[]) {
		Point a=new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);
	}
}
