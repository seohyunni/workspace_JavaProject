class Point{
	private int x,y; //한 점을 구성하는 x,y좌표
	
	Point(){
		this.x=this.y=0;
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	void showPoint() {
		//점의 좌표 출력
		System.out.println("("+x+", "+y+")");
	}
}
//point를 상속받은 ColorPoint선언

class ColorPoint extends Point{
	private String color; //점의 색
	ColorPoint(int x, int y, String color){
		super(x,y); //point의 생성자 point(x,y)호출
	}
	void setColor(String color) {
		this.color=color;
	}
	
	void showColorPoint(){
		//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point의 showPoint()호출
		
	}
}
public class ColorPointEx {
	public static void main(String args[]) {
		Point p=new Point(); //Point객체생성
	//	p.set(1, 2); //Point 클래스의set()호출
		
		ColorPoint cp=new ColorPoint(5,6,"Blue");
		/*cp.set(3,4);
		cp.setColor("red");*/
		cp.showColorPoint();
	}
}
