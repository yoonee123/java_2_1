package java_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���.");
		int sum = 0, n = 0, i;
		for (i = 0; i < 5; i++) {
			System.out.println(i + "���� >>");

			try {
				n = s.nextInt(); // �����Է�
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴϹǷ� �ٽ� �Է����ּ���.");
				s.next();
				i--;
				continue;
			}
			sum += n;
		
		}		System.out.println("����" + sum);
		s.close();
	}
}
