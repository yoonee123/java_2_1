package java_05;

public class NineX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				int hap = i * j;
				System.out.print(j+"*"+i+"="+hap+" ");
			}
			System.out.println();
		}
	}

}
