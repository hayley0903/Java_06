package Java_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoStore { 

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new LottoStore().startLotto();
	}

	public void startLotto() {
		while (true) {

			int choice = displayMenu();

			switch(choice) {
			//로또 구매하기
			case 1: 
				saleLotto();
				break;

				//프로그램 종료
			case 2:
				System.out.println("감사합니다. 안녕히가세요");
				//메소드를 종료하고 빠져나감 --> 시스템 종료 방법의 한종류 
				return;		

			default: 
				System.out.println("1 또는 2를 입력해주세요.");
			}
		}

	}

	public int displayMenu() {
		System.out.println("===로또 판매점===");
		System.out.println("1.Lotto 구매하기");
		System.out.println("2.프로그램 종료");
		System.out.println("=============");
		System.out.println("선택 : ");
		int choice = sc.nextInt();

		return choice;
	}

	//금액 받고 로또 판매
	public void saleLotto() {
		System.out.println("1000원에 로또 번호 하나씩 입니다.");
		System.out.println("로또는 최대 100매까지 구매가능합니다.");
		System.out.println("구매원하는 금액을 입력해주세요 : ");
		int money = sc.nextInt();

		System.out.println();
		
		if (money < 1000) {
			System.out.println("1000원이상을 입력해주세요");
			return;
		} 
		
		if (money > 100001) {
			System.out.println("100000원이하를 입력해주세요");
			return;
		} 
		
		//금액 체크 후 로또 번호 만들기로 넘어가기
		createLotto(money);
		
		System.out.print("받음 금액은" + money + "거스름돈은" + (money%1000) + "원 입니다.");
	}


	//로또 번호 생성
	public void createLotto(int money) {

		int lotCnt = money/1000;

		//랜덤 번호가 들어갈 HashSet을 만듬 ==> But, 중복된 데이터는 들어갈 수 없음
		HashSet<Integer> lottoSet = new HashSet<Integer>();

		for (int i = 1; i<= lotCnt; i++) {
			while(lottoSet.size() < 6) {
				int lotNum = (int) (Math.random() * 45 + 1);
				lottoSet.add(lotNum);
			}

			//6자리 숫자를 담을 arraylist에 담음
			ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
			Collections.sort(lottoList);
			System.out.println("로또 번호" + i + "번 >>>");

			for (int lottoNum : lottoList) {
				System.out.println(lottoNum + " ");
			} 
			
			System.out.println();
			lottoSet.clear();
		}
		

	}

}
