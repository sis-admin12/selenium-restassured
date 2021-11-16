
public class ConstructorExemple {
	
	public ConstructorExemple()//constructorul default
	{
		System.out.println("Sunt din constructor default");
	}
	
	public ConstructorExemple(int a, int b)//constructorul parametrizat
	{
		System.out.println("Sunt din constructor parametrizat si valoarea lui a este "+a);
	}
	
	public void getdata()//metoda
	{
		System.out.println("Sunt din metoda getdata");
	}

	public static void main(String[] args) {
		// cind este creat un obiect constructorul este chemat
		
		ConstructorExemple cd=new ConstructorExemple();//doar a fost creat si el cheama constructorul
		ConstructorExemple cp=new ConstructorExemple(4,5);
	}

}
