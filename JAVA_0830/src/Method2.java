
public class Method2 {
	public static void main(String[] args) {
		//��� public statuc int sum(int i1,int i2){
		//static : ������ ��ü�� �������� ����
		//int : ��ȯ Ÿ�� �޼ҵ�� �ܵ����� �ǹ̰� X sum�� � ����� �� �����ϰ� sum�� �θ� �༮���� int�� �ڱ� ��	���� ������
		//void : ��ȯ �� X ������ �ǹ� X
		//() : �Ű����� (�Ű� : �߰�����) ���� �ݵ�� ����� ��
		//�Ű����� ��� : ���� �ϳ��� �ƴ� �������� ����� �Ѱ��� �� �ִ� (int 1, int2)
		//��ü int sum=0;
		//for (int i=11; i<=i2; i++)
		//sum+=i;
		//return : ��ȯ���� void�� �ƴ� �̻� �����
		//=================================================================================================
		/*System.out.println("��(1~10) : " +sum(1,10));
		System.out.println("�� (1~100 : " +sum(10,100));
		System.out.println("��(100~1000) : "+sum(100,1000));
		�� �� ������ �Ʒ� ���� �ΰ����̶� ����*/
		//==============================================================================================
		int s1=sum(1,10);
		System.out.println("��(1~10) : "+s1);
		int s2=sum(10,100);
		System.out.println("�� (10~100) : "+s2);
		int s3=sum(100,1000);
		System.out.println("��(100~1000) : "+s3);
	
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
