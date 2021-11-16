
public class loopsexemple {

	public static void main(String[] args) {
		// loops
		
		int k=3;
		
	/*	for(int i=0;i<10;i++)
		{
			//System.out.println("\nStar outer loop " + i);
			
			for(int j=1;j<=10-i;j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}*/
		
		for(int i=3;i<15;i=i+3)// 3 
		{
			//System.out.println("\nStar outer loop " + i);
			
			for(int j=0;j<=i-3;j=j+3) //
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			
			System.out.println("");
		}


	}

}
