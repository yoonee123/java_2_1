package java_07;

class Pointer {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public Pointer() {
		this.x =  this.y = 0;
	}
	public Pointer(int x, int y)
	{
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

//Point�� ��ӹ��� ColorPoint ����
class ColorPointer extends Pointer { 
	private String color; // ���� ��
	public ColorPointer(int x, int y, String color) {
		super(x,y); // Point�� ������ Point(x,y)ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ�� 
	}
}

public class SuperEx {
	public static void main(String [] args) {
		ColorPointer cp = new ColorPointer(5, 6, "blue"); // ColorPoint ��ü 
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}
}
