package Java_01;



public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로

		int forTotal = 0;

		for (int i=1; i<=10; i++) {
			//forTotal = forTotal + i;
			forTotal += i;

			//System.out.println(i + " :: " + forTotal);
		}

		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

		int w = 1;
		int whileTotal = 0;

		while (w <= 100) {
			//whileTotal = whileTotal + w;
			whileTotal += w;			
			w++;

			// System.out.println(w + " :: " + whileTotal);
		}

		System.out.println("while total ==== " + whileTotal);
		System.out.println();
		
		
		// (for) 1~100까지의 정수 중 6의 배수 출력
		
		System.out.println("For문의 6의 배수");
		for (int i = 1; i <=100; i++) {
			if (i%6 == 0) {
				System.out.println(i);
			}
		}
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
		
//		System.out.println("While문의 6의 배수");
//		int w = 1;
//		while (w<=100) {
//			if (w%6 == 0) {
//				System.out.println(w);
//			} 
//			w++;
//		}
//		
		
		 //(for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
			for (int i = 1; i <=100; i++) {
				if (i % 6 == 0 && i % 12 != 0){
					System.out.println(i);
				}
			}

		
		
		//(while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력

			int k = 1;
			while (k<=200) {
				if (k % 6 == 0 && k % 12 != 0) { 
					System.out.println(k); 
					}
				k++;
			}
	
			
		//(for) 1-60000까지의 정수 중 100의 배수는 몇개일까요? 
			int cnt = 0;
			
			for (int e = 1; e<=60000; e++) {
				if (e % 100 == 0) {
					cnt ++;
				}
			}
			
			System.out.println("(for)100의 배수는 몇개?" + cnt);
			
			
		//(while) 1-60000까지의 정수 중 100의 배수는 몇개일까요? 	
			int cntt = 0;
			
			int v = 1;
			while (v<=60000) {
				if (v % 100 ==0) {
				cntt++; 
				}
				v++;
			} 
			
			System.out.println("(while)100의 배수는 몇개?" + cntt);
			
			
	
			
	}
			
}
			