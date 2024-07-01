package Java_05.car;

public class LightCar extends Car {
	
	private double discount; //할인혜택
	
	
	public LightCar() { 
		
	}
	
	//생성자 추가
	public LightCar (String model, int wheel, int seat, String fuel, double discount) {
		super(model, wheel, seat, fuel); //Car의 인자를 받아옴
		this.discount = discount;
			
		}
		
	public String carInfo() {
		
		String result = "";
		
		result += "[차종]: " + model +"\n";
		result += "[바퀴수]: " + wheel +"\n";
		result += "[좌석수]: " + seat +"\n";
		result += "[연료]: " + fuel +"\n";
		result += "[할인혜택]: " + discount +"\n";
		
		return result;
	}
	
	
	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
