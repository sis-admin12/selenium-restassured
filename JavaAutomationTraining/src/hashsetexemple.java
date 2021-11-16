import java.util.HashSet;
import java.util.Iterator;

public class hashsetexemple {

	public static void main(String[] args) {
		// set interface afiseaza tot random
		//hashSet nu accepta valori duplicate

		HashSet<String> hs= new HashSet<String>();
		hs.add("USASA");
		hs.add("UHAHA");
		hs.add("MOLDROM");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);//afiseaza totul random
		
		System.out.println(hs.remove("USASA"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
	
		//Iterator
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}

}
