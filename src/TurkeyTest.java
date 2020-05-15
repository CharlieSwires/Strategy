import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurkeyTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
        System.out.println("TurkeyTest");
        Duck d = new TurkeyAdaptor(new WildTurkey());
        Assert.assertTrue("WildTurkey display", "Wild Turkey".equals(d.display()));
        Assert.assertTrue("WildTurkey fly", "Fly a short distance!!".equals(d.performFly()));
        Assert.assertTrue("WildTurkey quack", "Gobble gobble!!".equals(d.performQuack()));
    }

}
