package java_06;

import java.util.Scanner;

public class Circle {
	int radius;
	String name;
	
public double getArea()
{
	return 3.14*radius*radius;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		Circle pizza;
		pizza = new Circle(); // 객체
		System.out.println("피자의 반지름을 입력하세요.");
		pizza.radius = s.nextInt();
		System.out.println("피자의 이름을 입력하세요.");
		pizza.name = s.next();
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle donut = new Circle();
		System.out.println("도넛의 반지름을 입력하세요.");
		donut.radius = s.nextInt();
		System.out.println("도넛의 이름을 입력하세요.");
		donut.name = s.next();
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
	}

}
