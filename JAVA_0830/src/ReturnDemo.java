
public class ReturnDemo {
	public static void main(String[] args) {
		printScore(99);
		printScore(200);
		printScore(5);
	}
	
	public static void printScore(int score) {
		if(score<0 || score>100)
		{
			System.out.println("잘못된 정수 : "+score);
			return;
		}
	
		
		System.out.println("정수 : "+score);
		
	}
}
