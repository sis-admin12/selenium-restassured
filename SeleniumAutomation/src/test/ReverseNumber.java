package test;

public class ReverseNumber {
	public static void main(String args[])
	   {
	      int number=234564;
	      int reverse = 0;
	 
	      while(number != 0)
	      {
	          reverse = reverse * 10;
	          System.out.println(reverse);
	          reverse = reverse + number%10; 
	          System.out.println(reverse);
	          number = number/10;
	          System.out.println(reverse);
	      }
	 
	      System.out.println("Reverse of the number is " + reverse);
	   }
}
