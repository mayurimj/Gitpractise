import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Araylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();
		a.add("Ms");
		a.add("Mayuri");
		a.add("Sanjayrao");
		a.add("Joshi");
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*****************");
		for(String s:a)
		{
			System.out.println(s);
		}
			System.out.println(a.contains("Selenium"))	;
			String[] name= {"Ms","Mayuri","Sanjay","Joshi"};
			List<String> namelist =Arrays.asList(name);
			System.out.println(namelist.contains("Mayuri"));
	}

}
