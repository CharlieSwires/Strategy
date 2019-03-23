
public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new Squeak());
	}

	public void display() {
		System.out.println("Rubber Duck");
	}
}
