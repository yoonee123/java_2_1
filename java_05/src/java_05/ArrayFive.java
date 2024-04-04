package java_05;

import java.util.Scanner;

public class ArrayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int array[] = new int[5];
		int max = 0;
		System.out.println("정수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++)
		{
			array[i] = s.nextInt();
			if(array[i] > max)
				max = array[i]; 
		}
		System.out.println("가장 큰수는 "+max+"입니다.");
		s.close();
	}

}
