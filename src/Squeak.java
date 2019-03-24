
public class Squeak implements QuackBehaviour{

	@Override
	public String quack() {
		String result = "Sqeak!!";
		System.out.println(result);
		return result;
	}

}
