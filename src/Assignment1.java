import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

@FunctionalInterface  
interface PerformOperation{  
    boolean perform(int number);  
}  

public class Assignment1 {
	
	public static PerformOperation isOdd() {
		return (num) -> (num & 1) == 1;
	}
	
	public static PerformOperation isPrime() {
		return (num) -> {
			for (int i = 2; i <= num / 2; i++) {
			    if (num % i == 0) {
				    return false;
			    }
		    }
			return true;
		};
	}
	
	public static PerformOperation isPalindrome() {
		return (num) -> {
			
			String str = num + "";
			
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					return false;
				}
			}
			
			return true;
		};
	}
	
	@Test
	public void testIsOdd() {
		assertFalse(isOdd().perform(0));
		assertTrue(isOdd().perform(1));
	}
	
	@Test
	public void testIsPrime() {
		assertFalse(isPrime().perform(4));
		assertTrue(isPrime().perform(5));
	}
	
	@Test
	public void testIsPalindrome() {
		assertFalse(isPalindrome().perform(110));
		assertTrue(isPalindrome().perform(101));
		assertTrue(isPalindrome().perform(11));
		assertTrue(isPalindrome().perform(1));
	}
}
