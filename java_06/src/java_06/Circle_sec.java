package java_06;

public class Circle_sec {
	int radius;
	String name;

	public Circle_sec() { // �Ű� ���� ���� ������ // ������ �̸��� Ŭ���� �̸��� ����
		radius = 1; name = ""; // radius�� �ʱⰪ�� 1
	}
	public Circle_sec(int r, String n) { // �Ű� ������ ���� ������ // �����ڴ� ���� Ÿ�� ����
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_sec pizza = new Circle_sec(10, "�ڹ�����"); // Circle ��ü ����, ������ 10

		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);

		Circle_sec donut = new Circle_sec(); // Circle ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
