package ch02;

// 강제 형변환 p52s
public class P52 {
	public static void main(String[] args) {
		byte byteValue = 5;
		int intValue = 100;

		System.out.println("byteValue = " + byteValue);
		System.out.println("intValue = " + intValue);
		byteValue = (byte) intValue;

		System.out.println("byteValue = " + byteValue);
		char charValue;

		charValue = (char) intValue;
		System.out.println("charValue = " + charValue);
		
		char charValue2 = '추';
		System.out.println("charValue2 = " + (int)charValue2);
	}
}
