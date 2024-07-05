package abs03;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	//final 매서드로 선언//행동패턴을 변경할 수 없음
	final public void go(int count) {
	
		run();
	
		for (int i = 0; i <count; i++) {
		jump();
		}
	
		turn();
	}
}
