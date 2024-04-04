package java_05;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		for(int k : n) // k는 n[0], n[1], ... n[5]까지 반복 
		{
			System.out.print(k + " "); // 반복되는 k값 출력
			sum += k;
		}
		System.out.println();
		System.out.println("합은 "+sum);
		
		for (String s : names)	// s는 names[0], names[1], ... names[5]까지 출력
		{
			System.out.print(s+" ");
			System.out.println();
		}
		}

}
