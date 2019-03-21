import java.util.Scanner;

class Rectt{
	private int width, height,sum=0;
	public Rectt(int width,int height) {
		this.width=width;
		this.height=height;
		
	}
	public int getArea() {
		return width*height;
		
	}
	
}
public class Ctest6 {
	public static void main(String args[]) {
		
		Rectt arr[]=new Rectt[4];
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0; i<=3; i++) {
			System.out.print((i+1)+".너비와 높이 >> ");
			arr[i]=new Rectt(sc.nextInt(), sc.nextInt());
			
			sum+=arr[i].getArea();
			
		}
			
		System.out.println(sum);
	}
}
