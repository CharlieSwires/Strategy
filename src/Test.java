import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {
	DecoyDuckTest ddt;
	MallardDuckTest mdt;
	RedHeadDuckTest rhdt;
	RubberDuckTest rdt;
	
	@BeforeEach
	void setUp() throws Exception {
		ddt = new DecoyDuckTest();
		mdt = new MallardDuckTest();
		rhdt = new RedHeadDuckTest();
		rdt = new RubberDuckTest();	
	}

	@org.junit.jupiter.api.Test
	void test() {
		ddt.test();
		mdt.test();
		rhdt.test();
		rdt.test();			
	}

}
