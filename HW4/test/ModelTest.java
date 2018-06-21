import static org.junit.Assert.*;

import org.itstep.Model;
import org.junit.Test;

public class ModelTest {

	@Test
	public void inputWordByScaner1() {
		Model model = new Model();
		String myTest = model.inputWordByScaner1("Andrey");
		assertEquals("Andrey", myTest);
	}
	
	@Test
	public void inputWordByScaner2() {
		Model model = new Model();
		long myTest = model.inputWordByScaner2((long)4);
		assertEquals(4, myTest);
	}
	
	@Test
	public void writeSentence() {
		Model model = new Model();
		String myTest = model.writeSentence("Andrey", (long)4);
		assertEquals("Andrey " + 4, myTest);
	}
	
	@Test
	public void inputWordByScaner1f2() {
		Model model = new Model();
		String myTest = model.inputWordByScaner1("Jack");
		assertNull(myTest);
    }
     
	@Test
	public void inputWordByScaner2f2() {
		Model model = new Model();
		long myTest = model.inputWordByScaner2((long)345);
		assertEquals(0, myTest);
	}
	
}
