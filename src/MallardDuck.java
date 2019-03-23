
public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	public void display() {
		System.out.println("Mallard duck");
	}
}
