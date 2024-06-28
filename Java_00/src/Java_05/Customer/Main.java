package Java_05.Customer;

public class Main {

	public static void main(String[] args) {
		
		//일반 고객
		
		Customer customerLee = new Customer();
		customerLee.setCustomerId("mem-Lee");
		customerLee.setCustomerName("Lee");
		
		System.out.println(customerLee.customerInfo());
		System.out.println(customerLee.calcRatio(10000));
	
		//VIP 고객
	
		VIPcustomer customerKim = new VIPcustomer();
		customerKim.setCustomerId("mem-Kim");
		customerKim.setCustomerName("Kim");
		
		System.out.println(customerKim.customerInfo());
		
		
		//VIP 고객 (추천하지 않음)
		Customer customerPark = new VIPcustomer();
		customerPark.setCustomerId("mem-Park");
		customerPark.setCustomerName("Park");
		
		System.out.println(customerPark.customerInfo());
		
	}
}


