package ch04;

import java.util.Scanner;

//주사위 게임
public class SwitchEx01 {
	public static void main(String[] args) {

		int count = (int) (Math.random() * 6) + 1;

		// 유저로부터 입력받은 값이 정답과 일치하는지
		// user 로부터 값 입력받기
		// 정답 입력값 일치여부 확인

		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		if(count == user) {
			switch (count) {
			case 1:
				System.out.println("count = 1");
				break;
			case 2:
				System.out.println("count = 2");
				break;
			case 3:
				System.out.println("count = 3");
				break;
			case 4:
				System.out.println("count = 4");
				break;
			case 5:
				System.out.println("count = 5");
				break;
			case 6:
				System.out.println("count = 6");
				break;
			default:
				System.out.println("count is not 1~6");
			}
			System.out.println("맞췄음");
		}else {
			System.out.println("틀렸음");
		}

		
		
		
		
	}
}
