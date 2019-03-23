import static org.junit.jupiter.api.Assertions.*;

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
		d.display();
		d.performFly();
		d.performQuack();
	}

}
