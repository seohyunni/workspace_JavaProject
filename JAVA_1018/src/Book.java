import java.util.Scanner;

public class Book {
	String title, author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		
	}
}

public class BookArray{
	public static void main(String[] args) {
		Book[] book=new Book[2];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<=book.length; i++) {
			System.out.println("å���� �Է�");
			String title=scan.nextLine();
			System.out.println("���� �Է� : ");
			String author=scan.nextLine();
			
			Book[i]=new Book(title,author);
			
		}
		for(int i=0; i<book.length;i++) {
			System.out.println(book[i].title+", "+book[i].author);
		}
		}
}
