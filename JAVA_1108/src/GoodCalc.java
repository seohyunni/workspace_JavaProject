abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
public class GoodCalc extends Calculator{
	
	public static void main(String[] args) {
		GoodCalc c=new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2,3));
		System.out.println(a.average(new int[] {2,3,4} ));
	}

}
