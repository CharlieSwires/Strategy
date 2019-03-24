
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super();
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new Mute());
	}

	public String display() {
		String result = "Looks like a duck";
		System.out.println(result);
		return result;
	}
}
