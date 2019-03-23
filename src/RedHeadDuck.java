
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	public void display() {
		System.out.println("Read Head Duck");
	}
}
