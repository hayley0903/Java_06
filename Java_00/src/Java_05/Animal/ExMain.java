package Java_05.Animal;

public class ExMain {

	public static void main(String[] args) {
		
		//가장 상위 생성자 생성
		animal animal = new animal();
		
		animal.move();
		animal.moveAnimal(new human());
		animal.moveAnimal(new tiger());
		animal.moveAnimal(new eagle());
		
	}

}
