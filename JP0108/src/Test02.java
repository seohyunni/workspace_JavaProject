class Account{
	private String name;
	private int balance;
	
	Account(String name, int balance){
		this.name=name;
		this.balance=balance;
		System.out.println(name+"´ÔÀÇ °èÁÂ°¡ ¸¸µé¾îÁ³½À´Ï´Ù. ÀÜ°í : "+balance);
	}
	public void deposit(int amount) {
		//ÀÔ±İ
		System.out.println(name+"´ÔÀÇ ÀúÃà±İ¾× : "+amount+" ÀÜ°í : "+(balance+amount));
	}
	
	public void withdraw(int amount) {
		//ÀÎÃâ
		System.out.println(name+"´ÔÀÇ ÀÎÃâ±İ¾× : "+amount+" ÀÜ°í : "+(balance-amount));
	}
	
	public void printBalance() {
		System.out.println(name+"´ÔÀÇ °èÁÂÀÜ°í : "+balance);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Account arr[]=new Account[2];
		
		arr[0]=new Account("±è¿µÈñ",10000);
		arr[1]=new Account("ÃÖÃ¶¼ö",50000);
		
		arr[0].deposit(10000);
		arr[0].withdraw(5000);
		
		arr[1].deposit(100000);
		arr[1].withdraw(30000);
		
		arr[0].printBalance();
		arr[1].printBalance();
		
	}
}
