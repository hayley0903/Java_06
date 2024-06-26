package Java_00; 

public class Operator04 {
	public static void main(String[] args) {


		// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
		// true(통과), false(거절)
		// Operator02에서는 true / false의 값만 확인하였으나, 조건 연산자를 통해 비교된 값을 원하는 형태의 결과로 보여줄 수 있다.

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		
		int animalNum = 1;
		String animal = "";
		String animalResult = "";
		
		
		animal = (animalNum == 1) ? "닭" : "소";
		animalResult = (animal == "닭") ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은" + animal + "이므로," + animalResult + "요리하겠습니다.");
		
		
		
		/* 나의 예제
		int animalChoice = 1;
		String Result = "";
		Result = (animalChoice == 1) ? "닭" : "소";

		
		String choiceRsult = "";
		choiceRsult = (Result == "닭") ? "치킨" : "스테이크";
			
		System.out.println("가져오신 동물은" + Result + "이므로," + choiceRsult + "요리하겠습니다.");
		*/

		
	
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
		
		int num = 2;	
		String numResult = "";
		
		numResult = (num%2 == 0) ? "짝수" : "홀수";

		System.out.println("입력하신 숫자 " + num + "은 " + numResult + "입니다.");
		
		
		float f = 10.11f;
		System.out.println(f);
		
		/*
		 * [평균 구하기]
		 * 
		 * 입력값 : 국어, 영어, 수학
		 * 조건1) 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격/ 미만이면 불합격
		 * 조건2) 평균 점수는 소수점 두자리까지 표시
		 * 
		 * 결과물 예시: 
		 * 당신의 국어 점수는 85점 입니다. 
		 * 당신의 영어 점수는 90점 입니다. 
		 * 당신의 수학 점수는 60점 입니다. 
		 * 
		 * 당신의 평균 점수는 78.33이고 불합격입니다. 
		 * 
		 */
		
		String var1 = "국어";
		String var2 = "영어";
		String var3 = "수학";
		
		int num1 = 85;
		int num2 = 90;
		int num3 = 50;
		

		System.out.println("당신의" + var1 + "점수는" + num1 + "점 입니다.");
		System.out.println("당신의" + var2 + "점수는" + num2 + "점 입니다.");
		System.out.println("당신의" + var3 + "점수는" + num3 + "점 입니다.");
		
		
		double average = (num1 + num2 + num3)/3;
		

		String testResult = "";
		testResult = (average >= 70 && num1>60 && num2 >60 && num3>60 ) ? "합격" : "불합격";
	
		
		System.out.println("당신의 평균 점수는 " + average + "이고 " + testResult + "입니다.");
		
		
		
		
	

	}
}
