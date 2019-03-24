import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecoyDuckTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println("DecoyDuckTest");
		Duck d = new DecoyDuck();
		Assert.assertTrue("Decoy display", "Looks like a duck".equals(d.display()));
		Assert.assertTrue("Decoy fly", "Can't fly!".equals(d.performFly()));
		Assert.assertTrue("Decoy quack", null == d.performQuack());
	}

}
