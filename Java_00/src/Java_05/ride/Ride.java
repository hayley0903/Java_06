package Java_05.ride;

public class Ride {
	
	//매개변수
	public String rideColor;
	
	//기본생성자
	public Ride () {
		
	}
	
	
	public void move() {
		
		System.out.println("이동수단을 타다");
		}
		
		
	public void moveRide(Ride ride) {
		ride.move();
	}


	
	//매개변수의 getter and setter
	public String getRideColor() {
		return rideColor;
	}

	public void setRideColor(String rideColor) {
		this.rideColor = rideColor;
	}
	
	
	

}
