package ch04;

public class LogicOperation {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		System.out.println("b1 = " + !b1);
		System.out.println("b2 = " + !b2);

		System.out.println(5 / 5);// 1
		System.out.println(5 % 5);// 0
		System.out.println(5 % 5 == 1);// false
		System.out.println(5 % 5 != 1);// true

		System.out.println(1 == 1);// true
		System.out.println(1 != 1);// false

		System.out.println((b1 && b2) || (b1 || b2));
		
	}
}
