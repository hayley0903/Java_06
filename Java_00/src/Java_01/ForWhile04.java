package Java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// for/while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
	
		
		for (int dan = 1; dan < 10; dan++) {
			System.out.println("====== [ while문 ] " + dan + " 단 ==========");
		int k = 1;
		while (k <= 9) {
			System.out.println(dan + "x" + k + "=" + dan*k);
			k++;
		} }
		
		System.out.println();
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		for (int dan = 1; dan < 10; dan++) {
			System.out.println("====== [ for문 ] " + dan + " 단 ==========");
		for (int v = 1; v <=9 ; v++) {
			System.out.println(dan + "x" + v + "=" + dan*v);
		}
		System.out.println();
		}
		
		
		// while/while 문 활용
		
		int dan = 1;
		
		while(dan < 10) {
			System.out.println("====== [ while문 ] " + dan + " 단 ==========");
		int k = 1;
		while (k <= 9) {
			System.out.println(dan + "x" + k + "=" + dan*k);
			k++;
			} 
		dan++;
		}
		
		System.out.println();
		
		
	}

}