package Java_01;

import java.util.Scanner; 

public class IfEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		// -----------------------------------------------------
		// 학생의 성적을 Scanner로 입력받아, 학점을 출력하세요.
		//
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 60점 미만이면, F
		// -----------------------------------------------------
		
		System.out.println("성적을 입력해주세요 : ");
		
		int score = sc.nextInt();
		
		String result = "";
		
		if (score >= 90) {
			System.out.println( result = "A");
		} else if (score >=80){
			System.out.println( result = "B");
		} else if (score >=70){
			System.out.println( result = "C");
		} else if (score >=60){
			System.out.println( result = "D");
		} else if (score < 60){
			System.out.println( result = "F");
		}
		
		
		
		
		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------
		System.out.println("1부터 5사이의 숫자를 입력해주세요. : ");
		int var = sc.nextInt();
		
		
		String english = "";
		
		if (var == 1) {
			System.out.println(english = "one");
		} else if (var == 2) {
			System.out.println(english = "two");
		} else if (var == 3) {
			System.out.println(english = "three");
		} else if (var == 4) {
			System.out.println(english = "four");
		} else if (var == 5) {
			System.out.println(english = "five");
		} else {
			System.out.println(english = "else");
		}
		System.out.println(var + "은" + english + "입니다.");
		
		sc.close();
	}
}
