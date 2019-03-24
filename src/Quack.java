
public class Quack implements QuackBehaviour {

	@Override
	public String quack() {
		String result = "Quack!";
		System.out.println(result);
		return result;
	}

}
