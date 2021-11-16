
public class OverloadingOverridingFunction extends Class2{
//overloading este declararea acela denumiri de metode dar nu argumente diferite
	public void Scaun()
	{
		System.out.println("Scaune noi");
	}
	
	public void getdata(int a)
	{
		System.out.println(a);
	}
	
	public void getdata(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingOverridingFunction FO=new OverloadingOverridingFunction();
		FO.getdata(1234);
		FO.getdata("Jopa");
		FO.Scaun();// functie overriding - citeste doar din clasa unde este din nou declarat obiectul
	}

}
