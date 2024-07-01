package Java_05.car;

public class Truck extends Car {
	
	private double weight; // 적재량

	//기본생성자
	public Truck () {
		
	}
	
	//생성자 추가
	public Truck (String model, int wheel, int seat, String fuel, double weight) {
		super(model, wheel, seat, fuel);
		this.weight = weight;
	}
	
	public String carInfo() {
		
		String result = "";
		
		result += "[차종]: " + model +"\n";
		result += "[바퀴수]: " + wheel +"\n";
		result += "[좌석수]: " + seat +"\n";
		result += "[연료]: " + fuel +"\n";
		result += "[적재량]: " + weight +"\n";
		
		
		return result;
		
	}
	
	
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
