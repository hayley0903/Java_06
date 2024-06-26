package member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		
		//같은 package안에서는 import없이 Member를 불러서 사용 가능
		Member member = new Member();
		
		member.setMemberId("hayley0903");
		member.setMemberName("이혜정");
		member.setMemberEmail("hyejeonglee0903@gmail.com");
		member.setMemberGender("female");
		member.setMemberPhone("010-8139-0617");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());


		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		//그룹 1 호출
		MemberDrama.dramaMemberInfo();

		

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}