import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GetUrlImformationTest {

	
	GetUrlImformation GET = new GetUrlImformation();
	ArrayList<Student>  even;
	@Before
	public void begin()
	{
		even = GET.get();
	}
	@Test
	public void testGet() {
		
		assertEquals("正1",even.get(0).list.iterator().next().getOrder());
		assertEquals("吳弼庭",even.get(0).name);
		assertEquals("10176222",even.get(0).number);
	}

	@Test
	public void testGet2() {

		assertEquals("正2",even.get(1).list.iterator().next().getOrder());
		assertEquals("徐正浩",even.get(1).name);
		assertEquals("10151924",even.get(1).number);
	}
	

	
	@Test
	public void testGet3() {

		assertEquals("元智大學 電機工程學系",even.get(235).list.get(1).getSchool());
		assertEquals("",even.get(235).name);
		assertEquals("10282816",even.get(235).number);
	}
//	@Test
//	public void testParase() {
//		fail("Not yet implemented");
//	}

}
