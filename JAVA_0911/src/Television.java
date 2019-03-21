
public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel=7;
		tv.volume=6;
		tv.onOff=true;
		
		System.out.println("텔레비전의 채널은 "+tv.channel+"이고 볼륨은 "+tv.volume+"입니다.");
		
		Television yourTv = new Television();
		yourTv.channel=9;
		yourTv.volume=4;
		yourTv.onOff=false;
		
		System.out.println("텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volume+"입니다.");
		
		Television tv1 = new Television();
		Television tv2 = tv1; //대입X, 가리키는 것
		
		int x=10, y=20;
		x=y; //x의 값->y로 대입
	}
}
