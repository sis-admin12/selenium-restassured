
public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]= {{200,99,66},
					  {45,59,6},
					  {75,25,999}};//matricea
		
		int min=abc[0][0];//initierea la mininum
		int max=abc[0][0];//initierea la maximim
		int mincoloana=0;//initiera la coloana cu minimul numar
		int maxr=0;//initierea la coloana cu maximul numar
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min>abc[i][j])
					{
					min=abc[i][j];
					mincoloana=j;
					//max=abc[i][j];
					}
				if(max<abc[i][j])
				{
					max=abc[i][j];
					maxr=i;
				}
			}
		}
		//min si max la toata matricea
		System.out.println("Numarul minim este: " +min);
		System.out.println("Numarul maxim este: " +max);
		
		//======================================================
		int maxcoloana=abc[0][mincoloana];
		int minrind=abc[maxr][0];
		int k=0;
		int n=0;
		
		while(k<3)
		{
			if(maxcoloana<abc[k][mincoloana])
			{
				maxcoloana=abc[k][mincoloana];
			}
			k++;
		}
		//maximul pe coloana cu cel mai mic numar
		System.out.println("Maximul pe coloana cu numarul cel mai mic este: " +maxcoloana);
		
		
			while(n<3)
			{
				if(minrind>abc[maxr][n])
				{
					minrind=abc[maxr][n];
				}
				n++;
		}
		
		//minimul pe rindul cu cel mai mare nr
		System.out.println("Minimul pe coloana cu numarul cel mai mare este: " +minrind);
	}

}
