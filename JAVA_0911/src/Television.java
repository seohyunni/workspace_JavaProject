
public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel=7;
		tv.volume=6;
		tv.onOff=true;
		
		System.out.println("�ڷ������� ä���� "+tv.channel+"�̰� ������ "+tv.volume+"�Դϴ�.");
		
		Television yourTv = new Television();
		yourTv.channel=9;
		yourTv.volume=4;
		yourTv.onOff=false;
		
		System.out.println("�ڷ������� ä���� "+yourTv.channel+"�̰� ������ "+yourTv.volume+"�Դϴ�.");
		
		Television tv1 = new Television();
		Television tv2 = tv1; //����X, ����Ű�� ��
		
		int x=10, y=20;
		x=y; //x�� ��->y�� ����
	}
}
