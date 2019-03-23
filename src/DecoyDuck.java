
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super();
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new Mute());
	}

	public void display() {
		System.out.println("Looks like a duck");
	}
}
