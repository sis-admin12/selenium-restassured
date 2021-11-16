import java.util.ArrayList;

public class ArrayListExemple {

	public static void main(String[] args) {
		// listarray accepta valori duplicate

		ArrayList<String> a= new ArrayList<String>();
		a.add("vaflea");
		a.add("picinusca");		
		a.add("picinusca");
		System.out.println(a);
		
		a.add(1, "zefir");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		System.out.println(a.get(1));
		System.out.println(a.contains("picinusca"));
		
		
	}

}
