import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class Assignment2 {

	public static List<Integer> rightmostDigits(List<Integer> input) {
		return input.stream()
				.map((a) -> a % 10)
				.collect(Collectors.toList());
	}
	
	@Test
	public void testRightmostDigits() {
		
		List<Integer> output = rightmostDigits(Arrays.asList(1, 22, 93));
		assertEquals((int)output.get(0), 1);
		assertEquals((int)output.get(1), 2);
		assertEquals((int)output.get(2), 3);
		
		output = rightmostDigits(Arrays.asList(16, 8, 886, 8, 1));
		assertEquals((int)output.get(0), 6);
		assertEquals((int)output.get(1), 8);
		assertEquals((int)output.get(2), 6);
		assertEquals((int)output.get(3), 8);
		assertEquals((int)output.get(4), 1);
		
		output = rightmostDigits(Arrays.asList(10, 0));
		assertEquals((int)output.get(0), 0);
		assertEquals((int)output.get(1), 0);
	}
}
