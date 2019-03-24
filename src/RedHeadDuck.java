
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	public String display() {
		String result = "Read Head Duck";
		System.out.println(result);
		return result;
	}
}
