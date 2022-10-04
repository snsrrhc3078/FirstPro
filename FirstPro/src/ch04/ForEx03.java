package ch04;

//다중for문 연습
public class ForEx03 {
	public static void main(String[] args) {
		
		
		
		for (int i = 2; i <= 9; i++)
		{
			for(int j = 1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));				
			}
			System.out.println('\n');
		}

		System.out.println('\n');

		// 마름모 그리기
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(' ');
			}

			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}	
			System.out.print('*');
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}	
			System.out.println();
		}
		for(int i = 0;i<11;i++) System.out.print('*');
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = -1; j < i; j++) {
				System.out.print(' ');
			}	
			for (int j = 5; j > i + 1; j--) {
				System.out.print('*');
			}
			System.out.print('*');
			for (int j = 5; j > i + 1; j--) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}
