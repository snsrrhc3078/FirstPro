package ch04;

public class ForEx01 {
	public static void main(String[] args) {
//		for문
		for (int i = 0; i < 10; i++) {
			System.out.println("for문" + i);
		}

//		while문
		int i=0;
		while (i < 10) {
			System.out.println("while문" + i);
			i++;
		}
//		do-while문
		i = 0;
		do {
			if (i == 0) {
				i = 5;
			}
			System.out.println("do-while문" + i);
			i++;

		} while (i < 10);

//		for문 j 감소
		for(i = 10;i>=0;i--) {
			System.out.println("for문 감소= "+ i);
			
		}
	}
}
