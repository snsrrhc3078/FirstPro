package ch04;

import java.util.Scanner;
public class DoWhileEx01 {
	public static void main(String[] args) {
		System.out.println((char)49);;
		String n1 = new String("abc");
		String n2 = new String("abc");
		
		if(n1 == n2) {
			System.out.println("==일치");
		}else {
			System.out.println("==불일치");
		}
		
		
		if(n1.equals(n2)) {
			System.out.println("equals일치");
		}else {
			System.out.println("equals불일치");
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("\n프로그램 종료는 q입력\n");
		do {
			System.out.print("> ");
			input = sc.nextLine();
			System.out.println("입력된 문자열은: " + input);
		}while(!input.equals("q"));
		System.out.println("프로그램 종료");
		
	}
	
}
