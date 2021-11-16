
public class Prime_numbers {

	public static void main(String[] args) {
		// verificarea numerelor prime

	    int a[]= {3,6,14,2,7,42,15,19,5, 101, 27, 9, 41, 25, 49, 1, 0};   
	    String  primeNumbers = "";
	    for (int i = 0; i <= a.length-1; i++)     
	      {                   
	         int counter=0;           
	         for(int j =a[i]; j>=1; j--)
	         {
	        if(a[i]%j==0)// se impart numerele incepind de la el pina la 1
	        {
	        counter = counter + 1;
	        }
	     }
	     if (counter ==2)//doar doua impartiri la 1 si la el insasi
	     {
	        primeNumbers = primeNumbers + a[i] + " ";
	     }  
	      } 
	      System.out.println("Prime numbers from given array is : ");
	      System.out.println(primeNumbers);
	   
	
		
		
}

}
