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
		pizza = new Circle(); // ��ü
		System.out.println("������ �������� �Է��ϼ���.");
		pizza.radius = s.nextInt();
		System.out.println("������ �̸��� �Է��ϼ���.");
		pizza.name = s.next();
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		Circle donut = new Circle();
		System.out.println("������ �������� �Է��ϼ���.");
		donut.radius = s.nextInt();
		System.out.println("������ �̸��� �Է��ϼ���.");
		donut.name = s.next();
		area = donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
	}

}
