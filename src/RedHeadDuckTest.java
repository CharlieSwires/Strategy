import static org.junit.jupiter.api.Assertions.*;

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
		d.display();
		d.performFly();
		d.performQuack();
	}

}
