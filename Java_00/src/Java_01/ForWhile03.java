package Java_01;

import java.util.Scanner;

public class ForWhile03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 구구단을 출력해 보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		
		if (1<=dan && dan<=9) { 
			
		// while 문 활용

		System.out.println("====== [ while문 ] " + dan + " 단 ==========");
		
		int k = 1;
		while (k <= 9) {
			System.out.println(dan + "x" + k + "=" + dan*k);
			k++;
		} 		
		System.out.println();
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] " + dan + " 단 ==========");
		
		for (int i = 1; i <=9 ; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		System.out.println();
		}
		
		
		else {
		System.out.println("1-9단 까지만 출력이 가능합니다.");
		}
		
		sc.close();
		
	}

}