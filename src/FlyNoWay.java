
public class FlyNoWay implements FlyBehaviour{

	@Override
	public String fly() {
		String result = "Can't fly!";
		System.out.println(result);
		return result;
	}

}
