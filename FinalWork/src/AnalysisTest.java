import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class AnalysisTest {
	Analysis ana;
	ArrayList<Student> even = new ArrayList();
	@Before
	public void begin()
	{
		ana = new Analysis(1);
//		GetUrlImformation getUrlImformation = mock(GetUrlImformation.class);
		GetUrlImformation getUrlImformation = new GetUrlImformation();
		even.add(new Student("ss","11"));
		even.get(0).list.add(new School("逢甲大學 資訊電機學院不分系榮譽班","10"));
		even.get(0).list.add(new School("國立暨南國際大學 資訊工程學系","10"));
		even.get(0).list.add(new School("國立彰化師範大學 電子工程學系","10"));
		
		even.add(new Student("sw","1000"));
		even.get(1).list.add(new School("逢甲大學 資訊電機學院不分系榮譽班","10"));
		even.get(1).list.add(new School("國立暨南國際大學 資訊工程學系","10"));
		even.get(1).list.add(new School("國立彰化師範大學 電子工程學系","10"));
		even.get(1).list.add(new School("逢甲大學 自動控制工程學系","10"));

		
		
		even.add(new Student("sasd","14540"));
		even.get(2).list.add(new School("逢甲大學 資訊電機學院不分系榮譽班","10"));
		even.get(2).list.add(new School("國立暨南國際大學 資訊工程學系","10"));
		even.get(2).list.add(new School("逢甲大學 機械與電腦輔助工程學系","10"));
		even.get(2).list.add(new School("元智大學 電機工程學系","10"));

//		when(getUrlImformation.get()).thenReturn(even);
		ana.setList(getUrlImformation.get());
	}
	@Test
	public void testAnalysis() {
		ana.doAnaly();
		//System.out.println(ana.answer_analy.size());
		Iterator<Answer> iter = ana.answer_analy.iterator();
		while(iter.hasNext()){
			Answer temp = iter.next();
			System.out.println(temp.name+","+temp.size);
		}
		
	}



}
