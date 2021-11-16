import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExemple {

	public static void main(String[] args) {
		// HashMAp nu este sincronizata este prea sigura
		//HashTable este sincroniza si mai sigur
		HashMap<Integer, String> h= new HashMap<Integer, String>();
		h.put(0, "bibi");
		h.put(1, "guru");
		h.put(2, "ha");
		h.put(3, "fiu");
		System.out.println(h);
		System.out.println(h.get(3));
		
		//SetMap
		Set s=h.entrySet();
		//iterator
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
		//System.out.println(i.next());//nu putem face asa deoace apare confuzie ce sa afiseze indexul sau valoarea
		Map.Entry m= (Map.Entry)i.next();
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		}
	}

}
