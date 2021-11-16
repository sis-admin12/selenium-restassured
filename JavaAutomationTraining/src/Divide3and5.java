
public class Divide3and5 {

	public static void main(String[] args) {
		// verifica care numar se imparte la 3 si 5
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
			{
				System.out.println(i+" se divide cu 3");
			}
			if(i%5==0)
			{
				System.out.println(i+ " se divide cu 5");
			}
			else
			{
				System.out.println(i+ " Nu se divide nici cu 3 nici cu 5");
			}
			
		}

	}

}
