class Circle4{
	private int radius;
	public Circle4(int radius)
{
		this.radius=radius;}
	public int getRadius() {
		return radius;
	}
}

class NamedCircle2 extends Circle4{
	private String name;
	NamedCircle2(int r, String name){
		super(r);
		this.name=name;
	}
	public void show() {
		System.out.println(name+", ¹ÝÁö¸§ : "+getRadius());
	}
}
public class Test04 {
	public static void main(String args[]) {
		NamedCircle2 w=new NamedCircle2(5, "Waffle");
		w.show();
	}

}
