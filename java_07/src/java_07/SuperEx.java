package java_07;

class Pointer {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public Pointer() {
		this.x =  this.y = 0;
	}
	public Pointer(int x, int y)
	{
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

//Point를 상속받은 ColorPoint 선언
class ColorPointer extends Pointer { 
	private String color; // 점의 색
	public ColorPointer(int x, int y, String color) {
		super(x,y); // Point의 생성자 Point(x,y)호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출 
	}
}

public class SuperEx {
	public static void main(String [] args) {
		ColorPointer cp = new ColorPointer(5, 6, "blue"); // ColorPoint 객체 
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}
