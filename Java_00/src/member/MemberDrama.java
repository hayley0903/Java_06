package member;

public class MemberDrama {
	
	public static void main(String[] args) {

		dramaMemberInfo();
		
	}

	public static void dramaMemberInfo() {
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)
		
		//그룹1
		Member mem1 = new Member("id_1","김성준");
		Member mem2 = new Member("id_2","김인원");
		Member mem3 = new Member("id_3","이상국");
		Member mem4 = new Member("id_4","이혜정");
		Member mem5 = new Member("id_5","이재엽");
		
		System.out.println("{회원}" + mem1.getMemberId() + " :: " + mem1.getMemberName());
		System.out.println("{회원}" + mem2.getMemberId() + " :: " + mem2.getMemberName());
		System.out.println("{회원}" + mem3.getMemberId() + " :: " + mem3.getMemberName());
		System.out.println("{회원}" + mem4.getMemberId() + " :: " + mem4.getMemberName());
		System.out.println("{회원}" + mem5.getMemberId() + " :: " + mem5.getMemberName());


	}

}