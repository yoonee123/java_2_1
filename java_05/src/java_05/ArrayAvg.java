package java_05;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int array[] = new int[5];
		double hap = 0;
		System.out.println("���� 5���� �Է��ϼ���.");
		for(int i = 0; i < 5; i++)
		{
			array[i] = s.nextInt();
			hap = hap + array[i];
		}
		double avg = hap / 5;
		System.out.println("�ټ� �� ���� ����� "+avg+"�Դϴ�.");
	}

}
