
public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	public String display() {
		String result = "Mallard duck";
		System.out.println(result);
		return result;
	}
}
