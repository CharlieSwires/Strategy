import static org.junit.jupiter.api.Assertions.*;

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
		d.display();
		d.performFly();
		d.performQuack();
	}

}
