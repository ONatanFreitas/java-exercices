import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {

		SecureRandom randomInteger = new SecureRandom();
			
		for (int i = 1; i <= 20; i++ ) {				
			int face = 1 + randomInteger.nextInt(6);
				
			System.out.printf("%d ", face);
				
			if (i % 5 == 0) {					
				System.out.println();
			}
		}
	}

}
