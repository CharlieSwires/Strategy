
public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new Squeak());
	}

	public String display() {
		String result = "Rubber Duck";
		System.out.println(result);
		return result;
	}
}
