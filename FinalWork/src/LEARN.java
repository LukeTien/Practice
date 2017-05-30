import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;





public class LEARN {
//	String answer;
//	static ArrayList<Student>  even =new ArrayList();
//	//static ArrayList<Student> odd =new ArrayList();
//	
//	static BufferedReader br;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
//		Iterator<Student> iter=even.iterator();
//		while(iter.hasNext())
//		{
//				System.out.println(iter.next().list.size());
//				
//		}
		GetUrlImformation ge = new GetUrlImformation();
		ge.get();
	}
	
	
}


interface Information{

	String getSchool();
	String getOrder();
}


class Student{
	String number;
	String name;
	ArrayList<Information> list;

	Student(String number,String name)
	{
		this.name = name;
		this.number = number;
		list = new ArrayList();
	}
	public void add(Information s) {
		list.add(s);
		//this.add(s);
	}
	
}



class School implements Information{
	String school;
	String order;
//	ArrayList<Information> list;
	School(String school,String order){
		this.school =  school;
		this.order = order;
	}
//	@Override
//	public void add(Information s) {
//		list.add(s);
//	}
	@Override
	public String getSchool() {
		// TODO Auto-generated method stub
		return school;
	}
	public String getOrder() {
		// TODO Auto-generated method stub
		return order;
	}
}




