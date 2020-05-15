import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {
	DecoyDuckTest ddt;
	MallardDuckTest mdt;
	RedHeadDuckTest rhdt;
	RubberDuckTest rdt;
	TurkeyTest tt;
	
	@BeforeEach
	void setUp() throws Exception {
		ddt = new DecoyDuckTest();
		mdt = new MallardDuckTest();
		rhdt = new RedHeadDuckTest();
		rdt = new RubberDuckTest();	
		tt = new TurkeyTest();
	}

	@org.junit.jupiter.api.Test
	void test() {
		ddt.test();
		mdt.test();
		rhdt.test();
		rdt.test();		
		tt.test();
	}

}
