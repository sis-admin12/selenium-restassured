
public class stringclassdemo {

	public static void main(String[] args) {
		
		String a = " Hello";//string literal - preferabil de utilizat doar acesta
		//String ab = new String("Hello");//string class
		
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("m"));
		System.out.println(a.substring(0, 5));
		System.out.println(a.substring(2));
		System.out.println(a.concat(" - Buna ziua"));
		System.out.println(a.trim());//de la inceput de rind, fara spatiu in fata
		String arr[]=a.split("e");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("l", "m"));

	}

}
