package Java_05.Customer;

public class Customer {
	
	//customerId - 고객ID
	//customerName - 고객이름
	//customerGrade - 고객등급
	//customerPoint - 고객포인트
	//customerRatio - 포인트적립비율

	
	//매개변수 만들기
	protected String customerId;
	protected String customerName;
	protected String customerGrade; //protected는 하위클래스까지 사용가능
	protected int customerPoint;
	protected double customerRatio;
	
	
	//기본 생성자 만들기
	public Customer() {
		customerGrade = "SILVER";
		customerRatio = 0.01;
	}
	
	//포인트 적립률 계산식 만들기
	public int calcRatio(int price) {
		customerPoint += price*customerRatio;
		
		return customerPoint;
	}
	
	
	
	//값을 리턴할 함수값 만들기
	public String customerInfo() {
		String result = "";
		
		result += "===고객아이디===" + customerId + "\n";
		result += "===고객이름===" + customerName + "\n";
		result += "===고객등급===" + customerGrade + "\n";
		result += "===보너스포인트==" + customerPoint + "\n";
		result += "===포인트적립===" + customerRatio + "\n";
		
		return result;
	}
	
	
	//getter/setter 만들기
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getCustomerPoint() {
		return customerPoint;
	}
	public void setCustomerPoint(int customerPoint) {
		this.customerPoint = customerPoint;
	}
	public double getCustomerRatio() {
		return customerRatio;
	}
	public void setCustomerRatio(double customerRatio) {
		this.customerRatio = customerRatio;
	}
	
	
	
}
