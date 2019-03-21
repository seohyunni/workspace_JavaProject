interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}
class MyAdder implements AdderInterface {
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int n) {
		
		int s=0;
		for(int i=0; i<=n; i++) {
			s+=i;
			return s;
		}
	}
	public static void main(String args[]) {
		MyAdder adder=new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
