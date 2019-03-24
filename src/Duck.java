
public class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("Swim swim");
		
	}
	public String display() {
		return null;
	}
	public String performQuack() {
		return quackBehaviour.quack();
		
	}
	public String performFly() {
		return flyBehaviour.fly();
		
	}
	public void setFlyBehaviour(FlyBehaviour fb) {
		this.flyBehaviour = fb;
		
	}
	public void setQuackBehaviour(QuackBehaviour qb) {
		this.quackBehaviour = qb;
	}
	
}
