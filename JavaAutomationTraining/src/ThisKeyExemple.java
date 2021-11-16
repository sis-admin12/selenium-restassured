
public class ThisKeyExemple {
	int a=45;//variabila globala
	
	public void getdata()
	{
		int a=5;//variabila locala
		int b=a+this.a;
		System.out.println(a);//afiseaza variabila locala daca este declarata daca nu pe ce globala
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyExemple th= new ThisKeyExemple();
		th.getdata();
	}

}
