	import java.util.ArrayList;
public class wrapperTest {



		public static void main(String[] args) {
			Integer in1 = new Integer(100);
			Integer in2 = new Integer(100);
			Integer in3 = new Integer(200);
			System.out.println("in1.equals(in2) --> "+in1.equals(in2));
			System.out.println("in1.equals(in3) --> "+in1.equals(in3));
			System.out.println("---------------------------------------------");
			
			System.out.println(new Integer(100).toString());
			System.out.println(new Double(55.7).toString());
			System.out.println("---------------------------------------------");
			
			System.out.println(Integer.valueOf("123"));
			//��Ƽ�� 123�� ��ü�� �� 
			System.out.println(Double.valueOf("123.456"));
			//�������� ��ü�� ����
			System.out.println(Integer.parseInt("456"));
			//String > int
			System.out.println(Double.parseDouble("709.45"));
			
			System.out.println(new Integer(100).intValue());
			System.out.println(new Double(3.11).doubleValue());
			
			ArrayList arr = new ArrayList();
			arr.add(new Integer(200));
			arr.add(100);
		}
	}

}
