package Java_05.ride;

public class ExMain {

	public static void main(String[] args) {
		
		Ride ride = new Ride();
		
		ride.move();
		ride.moveRide(new Air());
		ride.moveRide(new Bicycle());
		ride.moveRide(new Bike());
		ride.moveRide(new Bus());
		ride.moveRide(new Ship());
		
	
	}

}
