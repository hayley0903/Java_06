package memberMng;

import java.util.List;
import java.util.Scanner;

public class MemberService {

	MemberDAO mDAO;

	Scanner sc = new Scanner(System.in);


	//MemberDAO를 호출하기 위한 생성자 생성
	public MemberService() {
		mDAO = new MemberDAO();
	}

	// ===== 회원 관리 프로그램 =====
	// 1. 회원 정보 등록
	// 2. 회원 정보 수정
	// 3. 회원 정보 삭제
	// 4. 회원 정보 출력(이름)
	// 5. 회원 전체 정보 출력
	// 6. 프로그램 종료

	// 프로그램을 선택할 수 있는 메소드 
	public void startProgram(){

		boolean flag = true;

		//무한반복일때 조건을 true로 지정
		while (flag) {

			//choice를 printMenu메소드에서 받아오기
			int choice = printMenu();

			switch(choice) {
			case 1 :
				displayMsg("1. 회원 정보 등록");
				insertMember();
				break;
			case 2 : 
				displayMsg("2. 회원 정보 수정");
				updateMember();
				break;
			case 3 : 
				displayMsg("3. 회원 정보 삭제");
				removeMember();
				break;
			case 4 : 
				displayMsg("4. 회원 정보 출력(이름)");
				printMember();
				break;
			case 5 : 
				displayMsg("5. 회원 전체 정보 출력");
				printAllMembers();
				break;
			case 6 : 
				displayMsg("프로그램 종료");
				break;
			default : 
				displayMsg("잘못된 숫자가 입력함, 1-6사이의 숫자 입력 가능");
				break;
			} if (choice == 6) {
				flag = false;
				continue;
			}
		}
	}

	// 0.프로그램 메뉴
	public int printMenu() {
		displayMsg("===== 회원 관리 프로그램 =====");
		displayMsg("1. 회원 정보 등록");
		displayMsg("2. 회원 정보 수정");
		displayMsg("3. 회원 정보 삭제");
		displayMsg("4. 회원 정보 출력(이름)");
		displayMsg("5. 회원 전체 정보 출력");
		displayMsg(" 6. 프로그램 종료");
		displayMsg("[선택] : " );

		int choice = sc.nextInt();
		return choice;
	}

	//메세지 출력용
	public void displayMsg(String msg) {
		System.out.println(msg);	
	}

	//01.insertMembert 메서드
	public void insertMember() {
		//		private String memberId;	// 회원 아이디
		//		private String memberPw;	// 회원 비밀번호
		//		private String memberName;	// 회원 이름
		//		private String email;		// 이메일
		//		private String phone;		// 연락처

		//회원정보를 등록할 member 객체 생성자
		Member member = new Member();

		//회원정보 입력받기
		System.out.print("아이디");
		String memberId = sc.next();

		System.out.print("비밀번호");
		String memberPw = sc.next();

		System.out.print("이름");
		String memberName = sc.next();

		System.out.print("이메일");
		String email = sc.next();

		System.out.print("연락처");
		String phone = sc.next();

		//회원정보 세팅
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phone);

		//세팅된 member 를 List<Member>객체에 담는다
		mDAO.insertMember(member);

	}
	
	//02.회원 정보 수정
	public void updateMember() {
		List<Member> members = mDAO.findMember();

		
		System.out.println("수정할 회원 아이디를 입력하세요");
		String findId = sc.next();
		
		//아이디가 일치할때 수정 
		boolean flag = false;
		
		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);
		
			
			if (findId.equals(member.getMemberId())) {
				System.out.println(member.getMemberName() + "님의 정보를 수정해주세요");
				
				System.out.println("비밀번호를 입력해주세요. : ");
				member.setMemberPw(sc.next());
				
				System.out.println("이메일을 입력해주세요. : ");
				member.setEmail(sc.next());
				
				System.out.println("연락처를 입력해주세요. : ");
				member.setPhone(sc.next());
				
				flag = true;
				break;
			}
		}
		
		if (flag==false) {
			System.out.println("회원아이디가 없음");
		}
		
	}

	//03.회원 정보 삭제
	
	public void removeMember() {
		
		//현재 구성되어 있는 member리스트 가져오기
		//mDAO에 반환을 해주는 메소드 호출
		List<Member> members = mDAO.findMember();
		
		System.out.println("삭제할 회원 아이디를 입력하세요");
		String findId = sc.next();
		
		boolean flag = false;
		
		
		
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			
			if(findId.equals(member.getMemberId())) {
				
			
				mDAO.deleteMember(member);
				displayMsg("삭제 완료");
			
				flag = true;
				break;
			}
			
		}
		
		if (flag==false) {
			System.out.println("회원아이디가 없음");
		}
		
	}
	
	
	//04.회원 정보 출력 (각각)
	public void printMember() {

		List<Member> members = mDAO.findMember();

		System.out.println("조회할 회원 아이디를 입력하세요 : ");
		String findId = sc.next();

		//아이디가 일치할때 true로 바꿈
		boolean flag = false;


		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);

			if (findId.equals(member.getMemberId())) {
				displayMsg("회원아이디" + member.getMemberId());
				displayMsg("비밀번호" + member.getMemberPw());
				displayMsg("이름" + member.getMemberName());
				displayMsg("이메일" + member.getEmail());
				displayMsg("연락처" + member.getPhone());
				displayMsg("===========================");

				flag= true;
				break;
			}
		}

		if (flag ==false) {
			displayMsg("회원아이디가 없음");
		}


	} 

	//05.회원 전체 정보 출력
	public void printAllMembers() {
		List<Member> members = mDAO.findAllMember();


		for(int i = 0; i < members.size(); i++) {
			//members라는 리스트에서 회원정보를 가져오고
			Member member = members.get(i);

			//회원정보를 get(i)로 받는다
			displayMsg("회원아이디" + member.getMemberId());
			displayMsg("비밀번호" + member.getMemberPw());
			displayMsg("이름" + member.getMemberName());
			displayMsg("이메일" + member.getEmail());
			displayMsg("연락처" + member.getPhone());
			displayMsg("===========================");

		}
	} 


	



}


