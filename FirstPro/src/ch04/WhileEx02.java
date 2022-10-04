package ch04;

public class WhileEx02 {
	public static void main(String[] args) {
		int i = 1;

//		while(i<=20) {
//			
//			if(i%3 ==0) {
//				System.out.println("짝");
//			}else {
//				System.out.println(i);
//			}
//			i++;
//		}// end of while

		i = 0;

		while (i < 10) {
			if (i % 2 != 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} // end of while

	}

}
