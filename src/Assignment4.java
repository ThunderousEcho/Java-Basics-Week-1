import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class Assignment4 {

	public static List<String> xRemoved(List<String> input) {
		return input.stream()
				.map((a) -> a.replace("x", ""))
				.collect(Collectors.toList());
	}
	
	@Test
	public void testXRemoved() {
		
		List<String> output = xRemoved(Arrays.asList("ax", "bb", "cx"));
		assertEquals(output.get(0), "a");
		assertEquals(output.get(1), "bb");
		assertEquals(output.get(2), "c");
		
		output = xRemoved(Arrays.asList("xxax", "xbxbx", "xxcx"));
		assertEquals(output.get(0), "a");
		assertEquals(output.get(1), "bb");
		assertEquals(output.get(2), "c");
		
		output = xRemoved(Arrays.asList("x"));
		assertEquals(output.get(0), "");
	}
	
}
