package java_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요.");
		int sum = 0, n = 0, i;
		for (i = 0; i < 5; i++) {
			System.out.println(i + "번쨰 >>");

			try {
				n = s.nextInt(); // 정수입력
			} catch (InputMismatchException e) {
				System.out.println("정수가 아니므로 다시 입력해주세요.");
				s.next();
				i--;
				continue;
			}
			sum += n;
		
		}		System.out.println("합은" + sum);
		s.close();
	}
}
