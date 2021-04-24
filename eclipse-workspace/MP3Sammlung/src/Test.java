import java.util.*;

public class Test {
 static ArrayList<MP3> TitleList=new ArrayList<MP3> ();
 static String allTitle="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3 Titel1;
		Titel1=new MP3();
		Titel1.set_title("In the End");
		TitleList.add(Titel1);
		
		MP3 Titel2;
		Titel2=new MP3();
		Titel2.set_title("Castle of glass");
		TitleList.add(Titel2);
		
		MP3 Titel3;
		Titel3=new MP3();
		Titel3.set_title("Given up");
		TitleList.add(Titel3);
		
		//String testReturnTitle=Titel1.get_title();
		for(MP3 currentTitle:TitleList) {
			System.out.println("Title: "+currentTitle.get_title());
			allTitle=allTitle+currentTitle.get_title()+",";
		}
		for(MP3 currentTitle:TitleList) {
		System.out.println("Adress of current title is:" + currentTitle +" - "+currentTitle.get_title());
		}
		
		TitleList.remove(1);
		System.out.println(TitleList.size());
		System.out.println(allTitle);
		
	}

}
