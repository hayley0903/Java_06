package parking;

import java.util.Scanner;

public class ParkingMain {


	public static Scanner sc = new Scanner(System.in);

	//변수값이 절대 변할수없는 값이라고 선언
	static final int ROW = 4;
	static final int COL = 3;

	public static void main(String[] args) {

		// 주차 관리 프로그램
		// 주차장
		// 	□ □ □ 
		//	□ □ □ 
		//	□ □ □ 
		//	□ □ □



		String[][] parkingLot = new String [ROW][COL];

		//전체를 반복
		while(true) {

			System.out.println("주차장 현황");
			System.out.println();
			System.out.println("  1 2 3");

			for (int row =0; row < parkingLot.length; row++) {
				System.out.print(row+1 + " ");
				for (int col =0; col < parkingLot[row].length; col++) {
					if (parkingLot[row][col] == null) {
						System.out.print("□ " );
					} else {
						System.out.print("■ " );
					}
				} 	
				System.out.println();
			}

			System.out.println();
			System.out.println("원하는 메뉴를 선택해 주세요");
			System.out.println("1) 주차, 2) 출차, 3)종료");

			String menu = sc.next();

			switch (menu) {
			case "1" :
				System.out.println("주차하고 싶은 위치를 선택하세요");
				System.out.println("(예시) 세로 가로 - 2 1");

				int locationRow = sc.nextInt();
				int locationCol = sc.nextInt();

				//////////////////////////////////////////////////////////////
				//위치 선정 잘못된 경우 (row와 col의 값이 범위안에 없을때 오류)
				if (locationRow > ROW || locationCol > COL) {
					System.out.println("주차 위치 입력 오류");

					break;
				}

				//이미 주차된 차가 있을때 주차 불가
				if (parkingLot[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 주차된 차량이 있습니다.");

					break;
				} 
				//////////////////////////////////////////////////////////////
				System.out.println("차량번호를 입력해주세요 (예시 2020)");
				String carNum = sc.next();


				System.out.println("차량번호가" + carNum + "차량 번호가 맞습니까? (y/n)");
				String confirm = sc.next();


				if("y".equals(confirm)) {
					//index는 0부터 시작함으로 3을 입력시 인식할수 없으니 -1 해줘야 함
					parkingLot[locationRow-1][locationCol-1] = carNum;
					System.out.println("주차 완료");
				} else {
					System.out.println("처음 부터 다시 시작하세요");

				} 

				break;

			case "2" :
				System.out.println("차량번호를 입력해주세요");
				String carNum2 = sc.next();

				int count = 0;

				for (int row = 0; row <parkingLot.length; row++) {
					for (int col = 0; col < parkingLot[row].length; col++) {
						if(carNum2.equals(parkingLot[row][col])) {
							parkingLot[row][col] = null;
							System.out.println("안녕히 가세요");							
							break;
						} else {
							count ++;
						}
					}
				}
				if (count == ROW*COL) {
					System.out.println("차량이 존재하지 않습니다.");
				}

				break;

			case "3" :
				//모든 시스템을 한번에 종료
				System.out.println("시스템 종료");
				System.exit(0);
				break;

			default:
			}
		}
	}



}
