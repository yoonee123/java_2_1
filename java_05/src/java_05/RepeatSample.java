package java_05;

public class RepeatSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		for(;;)
		{
			System.out.print(c);
			c = (char) (c + 1);
			
			if(c >= 'z')
				break;
		} 
	}

}
