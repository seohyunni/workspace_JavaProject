

public class FruitSeller{
	int applePrice;
	int myMoney;
	int numOfApple;
	String name;
	
	public FruitSeller(String name, int numOfApple,int applePrice, int myMoney) {
		this.name=name;
		this.myMoney=myMoney;
		this.numOfApple=numOfApple;
		this.applePrice=applePrice;
	}//생성자
	
	public void showSellerInfo() { //판매자 정보를 보여주는 멤버메소드
		System.out.println("가게 이름 : "+name);
		System.out.println("판매 수익 : "+myMoney );
		System.out.println("사과 가격 : "+applePrice);
		System.out.println("남은 사과 : "+numOfApple);
		System.out.println();
	}
}
