package java_05;

import java.util.Scanner;

public class ArrayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int array[] = new int[5];
		int max = 0;
		System.out.println("���� 5���� �Է��ϼ���.");
		for(int i = 0; i < 5; i++)
		{
			array[i] = s.nextInt();
			if(array[i] > max)
				max = array[i]; 
		}
		System.out.println("���� ū���� "+max+"�Դϴ�.");
		s.close();
	}

}
