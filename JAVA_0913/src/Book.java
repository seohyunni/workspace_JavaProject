
public class Book {
	String title;
	String author;
	
	public Book(String t, String a) {
		title=t;
		author=a;
		
	}
	public static void main(String[] args) {
		Book littlePrince= new Book("어린왕자", "생텍쥐베리");
		System.out.println(littlePrince.title+", "+littlePrince.author);
		 
	}
}
