package java_05;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		for(;;)
		{
			System.out.print(">>");
			String t = s.nextLine();
			if(t.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�.");
		
		s.close();
	}

}
