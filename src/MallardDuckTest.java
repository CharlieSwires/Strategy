import static org.junit.jupiter.api.Assertions.*;

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
		d.display();
		d.performFly();
		d.performQuack();
	}

}
