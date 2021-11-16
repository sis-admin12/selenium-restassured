
public class SuperKey1 extends SuperKey2{
	
	//String name = "Dosea K1";//daca nu declaram aici va afisa ce este doar in Key2
	
	public SuperKey1()
	{
		super();
		System.out.println("Sunt din constructor K1");
	}
	public void getname()
	{
 System.out.println(name);//din primul SuperKey1 daca este declarat in k1
 System.out.println(super.name);//din SuperKey2
	}

	public void getdata()
	{
		super.getdata();
		System.out.println("Sunt din K1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKey1 sk = new SuperKey1();
		sk.getname();
		sk.getdata();
	}

}
