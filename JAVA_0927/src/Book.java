
public class Book {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book(String title) {
		this(title,"���ڹ̻�");

	}
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	//	System.out.println(this.title+" "+this.author);	
	}

	public static void main(String[] ar) {
		Book littlePrince=new Book("�����","�����㺣��");
		Book loveStory=new Book("������");
		Book emptyBook=new Book();

	}
}
