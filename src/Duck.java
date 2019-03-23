
public class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("Swim swim");
		
	}
	public void display() {
		
	}
	public void performQuack() {
		quackBehaviour.quack();
		
	}
	public void performFly() {
		flyBehaviour.fly();
		
	}
	public void setFlyBehaviour(FlyBehaviour fb) {
		this.flyBehaviour = fb;
		
	}
	public void setQuackBehaviour(QuackBehaviour qb) {
		this.quackBehaviour = qb;
	}
	
}
