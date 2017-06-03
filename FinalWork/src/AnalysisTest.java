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
		even.get(0).list.add(new School("�{�Ҥj�� ��T�q���ǰ|�����t�a�A�Z","10"));
		even.get(0).list.add(new School("��ߺ[�n��ڤj�� ��T�u�{�Ǩt","10"));
		even.get(0).list.add(new School("��߹��Ʈv�d�j�� �q�l�u�{�Ǩt","10"));
		
		even.add(new Student("sw","1000"));
		even.get(1).list.add(new School("�{�Ҥj�� ��T�q���ǰ|�����t�a�A�Z","10"));
		even.get(1).list.add(new School("��ߺ[�n��ڤj�� ��T�u�{�Ǩt","10"));
		even.get(1).list.add(new School("��߹��Ʈv�d�j�� �q�l�u�{�Ǩt","10"));
		even.get(1).list.add(new School("�{�Ҥj�� �۰ʱ���u�{�Ǩt","10"));

		
		
		even.add(new Student("sasd","14540"));
		even.get(2).list.add(new School("�{�Ҥj�� ��T�q���ǰ|�����t�a�A�Z","10"));
		even.get(2).list.add(new School("��ߺ[�n��ڤj�� ��T�u�{�Ǩt","10"));
		even.get(2).list.add(new School("�{�Ҥj�� ����P�q�����U�u�{�Ǩt","10"));
		even.get(2).list.add(new School("�����j�� �q���u�{�Ǩt","10"));

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
