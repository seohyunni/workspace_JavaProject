

class Rect {
	private int a, b;
	public int area() {
		return a*b;
		
	}
	public int around() {
		return a+b;
	}
	Rect(){
		a=10; b=10;
	}
	Rect(int a, int b){
		this.a=a;
		this.b=b;
	}
	
}
public class Ctest1 {
	public static void main(String[] args) {
		Rect r=new Rect();
		System.out.println(r.area());
		System.out.println(r.around());
		
	}
}
