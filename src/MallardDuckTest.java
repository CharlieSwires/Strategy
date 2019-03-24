import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MallardDuckTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println("MallardDuckTest");
		Duck d = new MallardDuck();
		Assert.assertTrue("Mallard display", "Mallard duck".equals(d.display()));
		Assert.assertTrue("Mallard fly", "Duck flying!".equals(d.performFly()));
		Assert.assertTrue("Mallard quack", "Quack!".equals(d.performQuack()));
	}

}
