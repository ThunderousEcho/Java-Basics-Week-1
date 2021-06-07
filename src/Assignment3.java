import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class Assignment3 {

	public static List<Integer> doubled(List<Integer> input) {
		return input.stream()
				.map((a) -> a * 2)
				.collect(Collectors.toList());
	}
	
	@Test
	public void testDoubled() {
		
		List<Integer> output = doubled(Arrays.asList(1, 2, 3));
		assertEquals((int)output.get(0), 2);
		assertEquals((int)output.get(1), 4);
		assertEquals((int)output.get(2), 6);
		
		output = doubled(Arrays.asList(6, 8, 6, 8, -1));
		assertEquals((int)output.get(0), 12);
		assertEquals((int)output.get(1), 16);
		assertEquals((int)output.get(2), 12);
		assertEquals((int)output.get(3), 16);
		assertEquals((int)output.get(4), -2);
		
		output = doubled(Arrays.asList());
		assertTrue(output.isEmpty());
	}
}
