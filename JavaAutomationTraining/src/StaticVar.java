
public class StaticVar {

	String name;//instance variable
	String address;
	static String city="Chisinau";//variabila statica(class variable)
	static int i=0;
	
	StaticVar(String name, String address)
	{
		this.name=name;// face ca variabila globala sa fie egala cu cea locala
		this.address=address;
		//this.city=city;
		i++;
		System.out.println(i);
	}
	
	public void getname()
	{
		System.out.println(name+" "+city);//name nui declarata aici deci va folosi pe cea globala
	}
	
	public static void getcity()//metoda statica
	{
		System.out.println(city);//lucreaza doar cu variabile statice declarate
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar sv= new StaticVar("Aliosha","Creanga");
		StaticVar sv1=new StaticVar("Sasha","Puskin");
		sv.getname();
		sv1.getname();
		//sv.getcity();
		StaticVar.getcity();
		
		
	}

}
