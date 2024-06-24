package Java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1에서 12사이의 숫자를 입력해주세요 (switch). : ");
		int num = sc.nextInt();
		
		String result = "";

		
		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12:
			result = "31일";
			break;
		case 4, 6, 9, 11:  
			result = "30일";
			break;
		case 2 : 
			result = "28일";
			break;
		default:
			result = "잘못된 입력";
		}
		
		System.out.println(num + "월의 마지막 날짜는 " + result + "입니다.");

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 31일 입니다.
		// -----------------------------------------------------

		
	
		
		// 동일한 조건식을 if문으로 작성해보기

		System.out.println("1에서 12사이의 숫자를 입력해주세요 (if). : ");
		
		int num1 = sc.nextInt();
		
		String result2 = "";
		
		if (num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12) {
			result2 = "31일";
		} else if (num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11) {
			result2 = "30일";
		} else if (num1 == 2) {
			result2 = "28일";
		} else {
			result2 = "잘못된 입력";
		}
		
		
		System.out.println(num1 + "월의 마지막 날짜는 " + result + "입니다.");

	}

}