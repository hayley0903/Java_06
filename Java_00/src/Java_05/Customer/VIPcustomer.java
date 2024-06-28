package Java_05.Customer;

public class VIPcustomer extends Customer {
	
	//VIP 고객 전용 혜택
	
	//새로운 매개변수 추가하기
	//agentID 전문상담사
	//saleRatio 구매할인율
	
	//bonusRatio - 0.05%
	
	
	private String agentId;
	private double saleRatio;
	
	//상속생성자만들기
	
	public VIPcustomer() {
		customerGrade = "VIP";
		customerRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	//값을 리턴할 함수만들기(제품할인율 포함)
	public String customerInfo() {
		
		String result = "";
		
		result += "===고객아이디===" + customerId + "\n";
		result += "===고객이름===" + customerName + "\n";
		result += "===고객등급===" + customerGrade + "\n";
		result += "===보너스포인트==" + customerPoint + "\n";
		result += "===포인트적립===" + customerRatio + "\n";
		result += "===제품구매할인율===" + saleRatio + "\n";
				
		return result;
		
	}

	
	//getter/setter 만들기
	
	public String getAgentId() {
		return agentId;
	}
	
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}



	
	


}
