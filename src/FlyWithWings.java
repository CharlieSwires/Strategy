
public class FlyWithWings implements FlyBehaviour{

	@Override
	public String fly() {
		String result = "Duck flying!";
		System.out.println(result);
		return result;
	}

}
