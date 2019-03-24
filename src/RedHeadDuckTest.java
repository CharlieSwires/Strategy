import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedHeadDuckTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println("RedHeadDuckTest");
		Duck d = new RedHeadDuck();
		Assert.assertTrue("Red Head display", "Read Head Duck".equals(d.display()));
		Assert.assertTrue("Red Head fly", "Duck flying!".equals(d.performFly()));
		Assert.assertTrue("Red Head quack", "Quack!".equals(d.performQuack()));
	}

}
