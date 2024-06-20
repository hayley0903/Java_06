package Exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12;
		int num2 = 25;

		String var1 = "변수";
		var1 = "크리스마스";
		
		System.out.println(num1 +"월 " + num2 + "일은 " + var1 + "입니다.");
		
		
		int curYear = 0;
		int lastYear = 0;
		curYear = 2024;
		lastYear = curYear - 1;
		
		float percent = 0.023f;
		percent = 72.893f;
		
		System.out.println("작년" + lastYear + "년도 대학 합격률은" + percent + "퍼센트 였습니다.");
		
		int num3 = 100;
		int num4 = 10;
		
		String result = "110";
		Integer.parseInt(result);
		
		int result1 = Integer.parseInt(result);
		
		
		System.out.println(num3 + "이라는 숫자에 " + num4 + " 을 더하면 " + result1 + "이 됩니다.");
		
		double var2 = 3.141592653589793;
		int num5 = 5;
		double var4 = var2*num5*2;
		double var5 = var2*num5*num5;
		
		System.out.println("원주율은 " + var2 + " 이고, 반지름이" + num5 + "인 원의 둘레는 " + var4 + "입니다.");

		System.out.println("반지름이" + num5 + "인 원의 넓이는 " + var5 + " 입니다.");
		
		
		char 뷁 = 0;
		
		char c = '뷁';
		int j = c;
		
		System.out.println("뷁의 문자번호는 " + j + " 입니다.");
		
		float var3 = 58.78945f;
		int intVal = (int) var3;
		
		System.out.println(var3 + "를 버림하면 " + intVal + " 입니다.");
		
		
	}

}
