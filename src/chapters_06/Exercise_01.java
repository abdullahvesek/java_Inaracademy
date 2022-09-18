package chapters_06;

public class Exercise_01 {

	public static void main(String[] args) {
		
		
		
		
		final int NUMBER_PER_LINE = 10; 

		
		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for (int i = 1; i <= 100 ; i++) {
			
			if (i % NUMBER_PER_LINE == 0) 
				System.out.printf("%7d\n", getPentagonalNumber(i));
			else
				System.out.printf("%7d", getPentagonalNumber(i));
		}
	}

	
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
		
		
		
	}

}
