// 최초는 아니고 2년차 java program 연습

public class Cold{
	// 멤버 변수 영역 static
	static int year = 2024;

	// 멤버 메소드(c에서는 func, 기능의 단위) 영역

	// 어플리케이션이 출발할 때 호출되는 메소드, main()

	public static void main(String [] args)
	{
		System.out.println("I don't know very well about Jesus");
		System.out.println("me too " + "and you?" + " wanna go home " + year);
	} // end of main() 
}
javac
dir
cd C:\Users\217\Desktop\20201599 // cd = change directory (주소변경)
javac -encoding utf-8 Cold.java // 인코딩을통해 utf-8(한국어)로 바꿔주기
java Cold