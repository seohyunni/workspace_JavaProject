
public class LocalVariable {
	public static void main(String[] args) {
		int a=0; 
		double b;
		
		//System.out.println(b); -초기화하지 않고는 사용할 수 없다.
		//System.out.println(a+c); -c변수가 선언되지 않았기 때문에
		
		int c=0;
		
		//public double d=0.0; 지역변수는 public으로 지정할 수 없다
		
		for(int e=0; e<10; e++) {
			//int a=1; 4행에서 선언된 지역변수 이름과 같다. 블록이 달라도 같은 이름으로는 다시 선언할 수 없다.
		}

}
