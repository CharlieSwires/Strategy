import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RubberDuckTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println("RubberDuckTest");
		Duck d = new RubberDuck();
		Assert.assertTrue("Rubber display", "Rubber Duck".equals(d.display()));
		Assert.assertTrue("Rubber fly", "Can't fly!".equals(d.performFly()));
		Assert.assertTrue("Rubber quack", "Sqeak!!".equals(d.performQuack()));
	}

}
