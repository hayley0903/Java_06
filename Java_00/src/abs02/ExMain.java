package abs02;

public class ExMain {
	
    public static void main(String[] args) {
    	//Car car = new Car(); 사용불가
        Car myCar = new ManualCar();
        myCar.run();
        
        System.out.println("-------------------------------------");

        Car newCar = new AICar();
        newCar.run();
    }


}
