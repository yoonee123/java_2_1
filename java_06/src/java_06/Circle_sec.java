package java_06;

public class Circle_sec {
	int radius;
	String name;

	public Circle_sec() { // 매개 변수 없는 생성자 // 생성자 이름은 클래스 이름과 동일
		radius = 1; name = ""; // radius의 초기값은 1
	}
	public Circle_sec(int r, String n) { // 매개 변수를 가진 생성자 // 생성자는 리턴 타입 없음
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_sec pizza = new Circle_sec(10, "자바피자"); // Circle 객체 생성, 반지름 10

		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle_sec donut = new Circle_sec(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
