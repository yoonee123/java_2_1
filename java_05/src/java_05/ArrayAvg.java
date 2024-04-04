package java_05;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int array[] = new int[5];
		double hap = 0;
		System.out.println("정수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++)
		{
			array[i] = s.nextInt();
			hap = hap + array[i];
		}
		double avg = hap / 5;
		System.out.println("다섯 수 합의 평균은 "+avg+"입니다.");
	}

}
