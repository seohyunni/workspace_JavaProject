
public class Method2 {
	public static void main(String[] args) {
		//헤더 public statuc int sum(int i1,int i2){
		//static : 별도의 객체를 생성하지 않음
		//int : 반환 타입 메소드는 단독으로 의미가 X sum이 어떤 결과를 다 수행하고 sum을 부른 녀석에게 int로 자기 다	값을 돌려줌
		//void : 반환 값 X 돌려줄 의무 X
		//() : 매개변수 (매개 : 중간역할) 형을 반드시 맞춰야 함
		//매개변수 목록 : 값을 하나가 아닌 여러개의 목록을 넘겨줄 수 있다 (int 1, int2)
		//본체 int sum=0;
		//for (int i=11; i<=i2; i++)
		//sum+=i;
		//return : 반환형이 void가 아닌 이상 써야함
		//=================================================================================================
		/*System.out.println("합(1~10) : " +sum(1,10));
		System.out.println("합 (1~100 : " +sum(10,100));
		System.out.println("합(100~1000) : "+sum(100,1000));
		위 한 문장이 아래 문장 두개씩이랑 같음*/
		//==============================================================================================
		int s1=sum(1,10);
		System.out.println("합(1~10) : "+s1);
		int s2=sum(10,100);
		System.out.println("합 (10~100) : "+s2);
		int s3=sum(100,1000);
		System.out.println("합(100~1000) : "+s3);
	
	}
	public static  int sum(int i1, int i2) {
		int sum=0;
		for(int i=i1; i<=i2; i++)
		{
			sum+=i;
		}
		return sum;
	}
}
