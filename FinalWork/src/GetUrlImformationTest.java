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
		
		assertEquals("��1",even.get(0).list.iterator().next().getOrder());
		assertEquals("�d�]�x",even.get(0).name);
		assertEquals("10176222",even.get(0).number);
	}

	@Test
	public void testGet2() {

		assertEquals("��2",even.get(1).list.iterator().next().getOrder());
		assertEquals("�}���E",even.get(1).name);
		assertEquals("10151924",even.get(1).number);
	}
	

	
	@Test
	public void testGet3() {

		assertEquals("�����j�� �q���u�{�Ǩt",even.get(235).list.get(1).getSchool());
		assertEquals("",even.get(235).name);
		assertEquals("10282816",even.get(235).number);
	}
//	@Test
//	public void testParase() {
//		fail("Not yet implemented");
//	}

}
