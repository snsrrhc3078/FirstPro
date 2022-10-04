package ch04;

//	if 조건문 연습 2
public class IfEx02 {
	public static void main(String[] args) {
		int score = (int)(Math.floor(Math.random()*101));
		char grade = 0;
		if (score <= 100 && score >= 90) {
			grade = 'A';
		} else if (score < 90 &&score >= 80) {
			grade = 'B';
		} else if (score < 80 &&score >= 70) {
			grade = 'C';
		} else if (score < 70 &&score >= 60) {
			grade = 'D';
		} else {
			if (score > 100 || score < 0) {
				System.out.println("잘못된 점수");
			} else {
				grade = 'F';
			}
		}

		if (grade != 0) {
			System.out.println(score + "점");
			System.out.println(grade + "학점");
		}		
	}
}