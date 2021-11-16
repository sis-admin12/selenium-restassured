
public class FirstClass {

	static int a =2345678;
	
	public void firstgetData()
	{
		System.out.println("Eu sunt din FirstClass");
	}
	
	public static void main(String[] args) {
		
		FirstClass fn=new FirstClass();
		fn.firstgetData();
		
		SecondClass sn=new SecondClass();
		sn.secondgetData();
		
		System.out.println("Hello World!");
		System.out.println("Number is: " + a);
	}

}
