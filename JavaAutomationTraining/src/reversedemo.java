
public class reversedemo {

	public static void main(String[] args) {
		
		String m="Madam";
		String t="";
		
		for(int i=m.length()-1; i>=0; i--)
		{
			//System.out.println(m.charAt(i));
			t=t + m.charAt(i);
			System.out.println(t);//plus cite o litera
		}
		System.out.println(t);//cuvintul inapoi il arata

		if(t.equals(m))
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("ùàà");	
		}
	}

}
