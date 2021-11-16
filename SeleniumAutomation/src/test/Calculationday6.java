package test;
public class Calculationday6 {
// se demonstreaza principiul polimorfism as remarca eu
	int sum(int x, int y) 
	{
		return x + y;
	}

	int sum(int x, int y, int z) 
	{
		return x + y + z;
	}

	double sum(double x, double y) 
	{
		return x + y;
	}

	double sum(double x, double y, double z) 
	{
		return x + y + z;
	}

	public static void main(String[] args) {

		Calculationday6 cal = new Calculationday6();
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(10, 20, 30));
		System.out.println(cal.sum(10.5, 20.0));
		System.out.println(cal.sum(10.5, 20.5, 30.5));
	}

}
