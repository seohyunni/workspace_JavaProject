class Song{
	private String title;
	Song(String title){
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
}


public class Ctest3 {
	public static void main(String ar[]) {
		Song mySong=new Song("Let it go");
		Song yourSong=new Song("������Ÿ��");
		System.out.println("�� �뷡�� "+mySong.getTitle());
		System.out.println("�� �뷡�� "+yourSong.getTitle());
	}
}
