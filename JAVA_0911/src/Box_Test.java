class Box {
	int width, length, height;
	
	//가로 : width 세로 length 높이 height
	
}
public class Box_Test {
	public static void main(String[] args) {
		Box b=new Box();
		b.width=20;
		b.length=20;
		b.height=20;
		System.out.println("가로 : "+b.width+" 세로 : "+b.length+" 높이 : "+b.height);
		/*객체 생성(객체 이름 b)
		 * 가로 :20, 세로 : 20, 높이 : 20 출력
		 */
	}
}
