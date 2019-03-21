class Point{
	private int x,y; //�� ���� �����ϴ� x,y��ǥ
	
	Point(){
		this.x=this.y=0;
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	void showPoint() {
		//���� ��ǥ ���
		System.out.println("("+x+", "+y+")");
	}
}
//point�� ��ӹ��� ColorPoint����

class ColorPoint extends Point{
	private String color; //���� ��
	ColorPoint(int x, int y, String color){
		super(x,y); //point�� ������ point(x,y)ȣ��
	}
	void setColor(String color) {
		this.color=color;
	}
	
	void showColorPoint(){
		//�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); //Point�� showPoint()ȣ��
		
	}
}
public class ColorPointEx {
	public static void main(String args[]) {
		Point p=new Point(); //Point��ü����
	//	p.set(1, 2); //Point Ŭ������set()ȣ��
		
		ColorPoint cp=new ColorPoint(5,6,"Blue");
		/*cp.set(3,4);
		cp.setColor("red");*/
		cp.showColorPoint();
	}
}
