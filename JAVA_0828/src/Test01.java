import java.util.*;
public class Test01 {
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	switch(n) {
	case 1 : System.out.println("아주 잘했습니다.");break;
	case 2 : System.out.println("잘했습니다.");break;
	case 3 : System.out.println("잘했습니다.");break;
	case 4 : System.out.println("보통입니다.");break;
	case 5 : System.out.println("보통입니다.");break;
	case 6 : System.out.println("보통입니다.");break;
	default : System.out.println("노력하세요.");break;
	}
}
}
