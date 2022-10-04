package ch02;

// 형변환 2 P59
public class P59 {
	public static void main(String[] args) {
		short v1, v2;
		byte v3;
		long result;
		v1 = 60;
		v2 = 70;

		v3 = (byte) (v1 + v2);
		result = (int) (v1 + (double) v2);
//		byte인 v1(60)과 byte 였다가 double로 강제 형변환 된 v2(70.0)가 
//		자동 형변환되어 double형의 130.0으로 덧셈이 되었고 그걸 int로 
//		강제 형변환 하여 int형 130이 된 값이 또 자동 형변환이 되어 
//		long형 130의 값이 되었다.
		System.out.println("v3= " + v3);
		System.out.println("result=" + result);

		result = (byte) (v1 + v2);
		System.out.println("result=" + result);
		result = (int) v1 + (int) v2;
		System.out.println("result=" + result);
	}
}
