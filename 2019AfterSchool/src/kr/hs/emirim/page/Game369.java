package kr.hs.emirim.page;

//1~99����
//���ڿ� 3, 6, 9�� ������ ¦�� ���
//�ƴϸ� ���ڸ� ����Ѵ�
public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<=99;i++) {
			//���� -> ���ڿ�
			String numberString =  String.valueOf(i);
			//�ϳ��� ���� '3' �Ǵ� '6' �Ǵ� '9'�� ������ ����
			int count = count369(numberString);
			if (count ==0){
				//������ 0�̸� �׳� �������
			
				System.out.println(i);
			} else {
				//�ƴϸ�,
				for(int i1=1; i1<count; i1++) {
					//������� '¦'���
					System.out.println("¦");
				}
				System.out.println();
				 
			
				
			}
			//0~length-1 ����
			//���ڸ� �ϳ��� ���ϰ�
			//�� ���ڰ� '3' �Ǵ� '6' �Ǵ� '9'�̸� ¦
			System.out.println(i);
	}
	
}

	private static int count369(String numberString) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<numberString.length();i++) {
			char ch0 = numberString.charAt(i);
			if(ch0 == '3' || ch0 =='6'|| ch0=='9') {
				sum++;
			}
		
		}
		return sum;
	}
}