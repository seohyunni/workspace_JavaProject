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
		Song yourSong=new Song("강남스타일");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("네 노래는 "+yourSong.getTitle());
	}
}
