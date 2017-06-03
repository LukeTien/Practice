import java.util.ArrayList;
import java.util.Iterator;

public class Analysis {
	String anaString;
	int todo;
	ArrayList<Student> analy;
	ArrayList<Answer> answer_analy;
	public Analysis(int todo){
		this.todo = todo;
		if(todo == 1)
		{
			anaString =  "逢甲大學";
		}
		else if(todo == 2)
		{
			anaString =  "資訊電機學院不分系榮譽班";
		}
//		this.analy = analy;
		answer_analy = new ArrayList();
	}
	void setList(ArrayList analy)
	{
		this.analy = analy;
	}
	void doAnaly(){
		Iterator student_iter = analy.iterator();
		int i = 0;
		int flag = 0;
		String s;
		while(student_iter.hasNext())
		{
			Student student = (Student) student_iter.next();
			AnalyWhat ana_what = new AnalyWhat(student,todo);
			
			
			while((s = ana_what.getAnalyWhat())!=null)
			{
				if(s.equals(anaString) != true)
				{
					while(i < answer_analy.size()){
						if(answer_analy.get(i).name.equals(s)){
						   answer_analy.get(i).size ++;
						   flag = 1;
						}
						i++;
					}
					if(flag == 0){
						answer_analy.add(new Answer(s));
						answer_analy.get(i).size++;
					}
					flag = 0;
					i = 0;
				}
			}
		}
	}
	
}


class AnalyWhat
{
	String s;
	int todo;
	Iterator<Information> school;
	
	AnalyWhat(Student student,int todo){
		school = student.list.iterator();
		this.todo = todo;
	}
	
	String getAnalyWhat(){
		if(todo == 1){
			if(school.hasNext()){
				s = school.next().getSchool();
			}
			else{
				s = null;
			}
		}
		else{
			if(school.hasNext()){
				s = school.next().getlearn();
			}
			else{
				s = null;
			}
		}
		return s;
	}
}

class Answer{
	String name;
	int size;
	Answer(String name)
	{
		this.name = name;
		this.size = 0;
	}
}