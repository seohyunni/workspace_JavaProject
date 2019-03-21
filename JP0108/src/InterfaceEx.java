interface Phoneinterface{
	int BOTTONS=20;
	void sendCall();
	void receiveCall();
}

interface MobilePhoneinterface extends Phoneinterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3interface {
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}
//SmartPhone 클래스는 PDA를 상속받고 MobilePhoneinterace와 MP3interface 안터페이스에 선언된 메소드를 모두 구현

class SmartPhone extends PDA implements MobilePhoneinterface, MP3interface{
	public void sendCall() {
		System.out.println("전화 걸기");
	}
	public void receiveCall() {
		System.out.println("전화 받기");
	}
	public void sendSMS() {
		System.out.println("SMS 보내기");
	}
	public void receiveSMS() {
		System.out.println("SMS 받기");
	}
	
	public void play() {
		System.out.println("음악 재생");
	}
	public void stop() {
		System.out.println("재생 중지");
	}
	
	public void schedule() {
		System.out.println("일정 관리");
	}
	
public class InterfaceEx {
	public static void main(String args[]) {
	SmartPhone p = new SmartPhone();
	p.sendCall();
	p.play();
	System.out.println(p.calculate(3,5));
	p.schedule();
	}
}