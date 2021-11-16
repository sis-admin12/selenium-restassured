
public class ExceptionExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int b=1;
		
		try//incearca
		{
			int arr[]=new int[5];
			int k=a/b;//impartirea la zero nu poate fi
			System.out.println(arr[1]);
			System.out.println(k);
			
		}
		
		catch(IndexOutOfBoundsException ets)//daca e imposibil sau exceptie face bucla
		{
			System.out.println("Am prins eroareaindexoutofbunds/exceptia");
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("Am prins eroareaaritmetica/exceptia");
		}
		
		catch(Exception e)//daca e imposibil sau exceptie face bucla
		{
			System.out.println("Am prins eroarea/exceptia");
		}
		finally
		{
			System.out.println("delete cookie");//se executa mereu chiar daca nu sunt exceptii sau erori
			
		}
		
	}

}
