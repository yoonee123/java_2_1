package java_05;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {1,2,3,4,5};
		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		
		int sum = 0;
		for(int k : n) // k�� n[0], n[1], ... n[5]���� �ݺ� 
		{
			System.out.print(k + " "); // �ݺ��Ǵ� k�� ���
			sum += k;
		}
		System.out.println();
		System.out.println("���� "+sum);
		
		for (String s : names)	// s�� names[0], names[1], ... names[5]���� ���
		{
			System.out.print(s+" ");
			System.out.println();
		}
		}

}
