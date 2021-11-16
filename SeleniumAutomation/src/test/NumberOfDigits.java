package test;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int count = 0;
		int num = 345254634;

        while(num != 0)
        {
            num /= 10;  // 345  34  3
            ++count;
        }

        System.out.println("Number of digits is - " + count);
		

	}

}
