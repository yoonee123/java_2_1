package java_05;

public class ReturnArray {

	static int[] makeArray() { // ������ �迭�� �����ϴ� �޼ҵ�
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i; // �迭�� ���Ҹ� 0, 1, 2, 3���� �ʱ�ȭ
		}
		return temp; // �迭 ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[];
		Array = makeArray(); // �޼ҵ�κ��� �迭 ��������
		for (int i = 0; i < Array.length; i++) 
		{
			System.out.print(Array[i] + " "); 
		}
	}

}
