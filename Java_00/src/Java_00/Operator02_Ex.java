package Java_00;

public class Operator02_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//- >, >=, <, <=, ==(equals), !=(not equals)
		
		int a = 100;
		int b = 50;
		int c = 1;
		
		//a가 b보다 클까요?
		//b가 c보다 크거나 같을까요?
		//a가 c보다 작을까요? 
		//a가 b보다 작거나 같을까요?
		//a와 b가 같을까요?
		//a와 a가 다를까요?
		//b와 c가 다를까요?
		
		System.out.println(a > b);
		System.out.println(b >= c);
		System.out.println(a < c);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != a);
		System.out.println(b != c);

		
		
		// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
		// true(통과), false(거절)
		
		int age = 35;
		boolean ageResult;
		
		ageResult = age >= 19;
		
		System.out.println("나이 : " + age);
		System.out.println("통과 : " + ageResult);
		


		// 숫자 입력 - 짝수인지, 아닌지를 판단
		
		
		int num = 3;
		int numResult;
		
		numResult = num % 2;
		boolean numFlag;
		
		numFlag = numResult == 0;
		
		System.out.println(num  + "은 짝수 입니다 >>>>>>>" + numFlag);
	}

}
