package ch04;
//	while문 연습
public class WhileEx01 {
	public static void main(String[] args) {
//		for문
		double v = 0;
		int n = 10;
		for(int i = 1; i<=n;i++) {
			v += i;
		}
		System.out.println("총합 = " + v);
		v /= n;
		System.out.println("평균 = " + v);
		
		
		System.out.println();
		System.out.println();
		
		
//		while문
		int i=1;
		while(i<6) {
			System.out.println(i + " ");
			i++;
		}		
	}
	
	
	
		
}
