package testing;

import com.seis635.SkunkApp;
import org.junit.*;

public class SkunkAppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		assert(true)
	}
	@Test
	public void rollDieShouldBeBetweenOneAndSix(){

		SkunkApp app = new SkunkApp();

		int dieRoll =  app.rollDie();
		boolean isBetweenOneAndSix;
		if(dieRoll > 0 && dieRoll < 7){
			isBetweenOneAndSix = true;
		} else {
			isBetweenOneAndSix = false;
		}

		Assert.assertTrue(isBetweenOneAndSix);
	}

}
