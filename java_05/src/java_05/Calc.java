package java_05;

public class Calc {
	public static void main (String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++) // ���� ������ŭ �ݺ�
			sum += Double.parseDouble(args[i]); // ���ڿ��� �Ǽ�(double Ÿ��)�� ��ȯ�Ͽ� �ջ�
	
		System.out.println("�հ� :" + sum);
	}
}

