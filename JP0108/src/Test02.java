class Account{
	private String name;
	private int balance;
	
	Account(String name, int balance){
		this.name=name;
		this.balance=balance;
		System.out.println(name+"���� ���°� ����������ϴ�. �ܰ� : "+balance);
	}
	public void deposit(int amount) {
		//�Ա�
		System.out.println(name+"���� ����ݾ� : "+amount+" �ܰ� : "+(balance+amount));
	}
	
	public void withdraw(int amount) {
		//����
		System.out.println(name+"���� ����ݾ� : "+amount+" �ܰ� : "+(balance-amount));
	}
	
	public void printBalance() {
		System.out.println(name+"���� �����ܰ� : "+balance);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Account arr[]=new Account[2];
		
		arr[0]=new Account("�迵��",10000);
		arr[1]=new Account("��ö��",50000);
		
		arr[0].deposit(10000);
		arr[0].withdraw(5000);
		
		arr[1].deposit(100000);
		arr[1].withdraw(30000);
		
		arr[0].printBalance();
		arr[1].printBalance();
		
	}
}
