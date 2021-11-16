
public class StringDemo {

	public static void main(String[] args) {
		String a="hello";//string literal
		String b="hello";//face referinta la obiectul a
		String c=a.concat(" world");//adauga la a world
		System.out.println(c);
		String s=new String("hello");//clasa string creaza de fiecare data un obiect nou in memorie
		String s1=new String("hello");
		
		System.out.println(a.equals(b));//compara continutul - true
		System.out.println(a==b);//true
		System.out.println(a.equals(s));//true
		System.out.println(a==s);//false deoarece nu se refera la acelasi obiect
		System.out.println(s==s1);//false  deoacere referinta la diferite obiecte
		System.out.println(s.equals(s1));//true
		
		//Buffer and Builder is mutble
		StringBuffer sb=new StringBuffer("helloo");
		sb.append(" worlde");//adauga la helloo worlde
		System.out.println(sb);
		sb.insert(2, "liuliu");//adauga liuliu dupa al doilea caracter
		System.out.println(sb);//heliuliulloo worlde
		sb.replace(3, 9, "pidr");
		System.out.println(sb);//helpidrloo worlde
		sb.deleteCharAt(16);
		System.out.println(sb);//helpidrloo world
		sb.reverse();
		System.out.println(sb);//dlrow oolrdipleh
		//StringBuilder sbb=new StringBuilder("helloo");
		//Builder is faster, is not asyncronized, is not safe
	}

}
