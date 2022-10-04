package ch02;

/*
 * 자동, 강제 타입 변환 P51
 * 정수: byte(1), short(2), int(4), long(8)
 * 실수: float(4), double(8)
 * char: (2)
 * */
public class P51 {
	public static void main(String[] args) {
//		크기가 작은 타입 -> 큰 타입으로 변환
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 40L;

		float v5 = v1 + v2 + v3 + v4;
		double v6 = 2.54;
		v4 = v1;

		System.out.println("v1=" + v1); // 10
		System.out.println("v2=" + v2); // 20
		System.out.println("v3=" + v3); // 30
		System.out.println("v4=" + v4); // 40
		System.out.println("v5=" + v5); // 100.0
		System.out.println("v6=" + v6); // 2.54

		char v7 = '됆';
		v2 = (short) v7;
		v3 = v7;
		System.out.println("v7=" + v7); // 됆
		System.out.println("v2=" + v2); // 숫자
//		char과 short 둘 다 2바이트지만 char은 부호가 없어
//		v7의 됆 이라는 글자가 short의 정쉬 최대 표시 영역인
//		32767을 넘어서 오버플로우가 발생하는 것을 볼 수 있음
		System.out.println("v3=" + v3); // 숫자
	}
}
