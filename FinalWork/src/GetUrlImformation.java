import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class GetUrlImformation {
	
	String answer;
	static ArrayList<Student>  even =new ArrayList();
	static BufferedReader br;
	
	
	public void get(){
		try {
			
			URL url = new URL("http://freshman.tw/cross/106/015262");
			HttpURLConnection con= (HttpURLConnection)url.openConnection();
			con.setDoInput(true);
			con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64)");

			
			InputStreamReader a=new InputStreamReader(con.getInputStream(),"utf-8");
			br = new BufferedReader(a);
			String s;
			while(( s = br.readLine())!=null)
			{	
					parase(s);			
			}

			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Iterator <Student> iter=even.iterator();
//		while(iter.hasNext())
//		{
//				System.out.println(iter.next().name);
//				
//		}
	}
	
	public  void parase(String s){
		int Numberstart = 0,Numberend=0,schstart=0,schend=0;
		String answer,temp;
		
		
		int count = 0,endi=0,i=0,spanstart=0,spanend=0,namestart=0,nameend=0;
		int tdstart=0,tdend=0;
		while((Numberstart = s.indexOf("<span class=\"number\"><a id=\"",tdend+1))!=-1)
		{
			Numberend = s.indexOf("</a>",Numberstart+1);
			temp=s.substring(Numberstart+38,Numberend);
			
			namestart = s.indexOf("</div></td><td rowspan=",Numberend+1);
			nameend = s.indexOf("<span",namestart+1);
			answer = s.substring(namestart+27,nameend);
//			System.out.println(answer);
			
			spanstart=s.indexOf("display:none\">",nameend);
			spanend=s.indexOf("</span>",spanstart+1);
			endi = Integer.valueOf(s.substring(spanstart+14,spanend));
			
			
			
			
			
			
			even.add(new Student(temp,answer));
//			System.out.println(even.size());
			
				
					
			while(i < endi){
				schstart = s.indexOf("<a href=\"",schend+1);
				schend = s.indexOf("</a>",schstart+1);
				temp=s.substring(schstart,schend);
				
				if(temp.contains("#")==true)
				{
					temp = s.substring(schstart+12,schend);
				}
				else if(temp.contains("crown")==true)
				{
					temp = s.substring(schstart+44,schend);
				}
				else
				{
					temp = s.substring(schstart+17,schend);
				}
				
				
				tdstart = s.indexOf("<td>",schend+1);
				tdend = s.indexOf("</td>",tdstart+1);
				answer = s.substring(tdstart,tdend);
				if(answer.contains("badge badge-default small")==true)
				{
					answer = s.substring(tdstart+44,tdend-7);
					
				}
				else if(answer.contains("badge badge-danger small")==true){
					answer = s.substring(tdstart+43,tdend-7);
					
				}
				else
				{
					answer = "";
				}
				
//				System.out.println(temp);
				

				
				
				//System.out.println(temp);
				Student iter = even.get(even.size()-1);
				iter.add(new School(temp,answer));
//				sc.add(new school(temp));
				i++;
			}
			i=0;
		}
	}
}
