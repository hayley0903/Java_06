package Java_05.car;

public class LightCar extends Car {
	
	private double discount; //할인혜택
	
	
	public LightCar() { 
		
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
