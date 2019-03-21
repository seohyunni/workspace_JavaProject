
public class Overload {
	public static void main(String[] args) {
		int i1=3, i2=7, i3=10;
		double d1=7.0, d2=3.0;
		System.out.println(max(i1,i2));
		System.out.println(max(d1,d2));
		System.out.println(max(i1,i2,i3));
	}
	public static int max(int n1, int n2) { //이름은 같지만 타입이 다른 경우, 중복가능
		int result=n1>n2 ? n1:n2;
		//n1>n2 ? -> n1이 n2보다 크면?
		//n1:n2 -> 조건을 만족하면 추출할 값을 왼쪽에, 만족하지 않으면 오른쪽에 놓음
		return result;
	}
	public static double max(double n1, double n2) {
		double result=n1>n2 ? n1:n2;
		return result;
	}
	
	public static int max(int n1, int n2, int n3) {//메소드 시그니쳐
		int result = n1>n2 ? n1:n2;
		int result1 = result>n3 ? result :n3;
		return result1;
		
	}
}
