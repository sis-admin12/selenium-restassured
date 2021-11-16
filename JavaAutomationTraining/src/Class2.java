
public class Class2 extends Class1{

	public void Tabla()
	{
		System.out.println("Tabla noua");
	}
	public void color()
	{
		System.out.println(color);//afiseaza culoara declarata in Class1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class2 c=new Class2();
		c.color();
		c.Mese();
		c.Scaun();
		c.Tabla();//functie overriding
		
	}

}
