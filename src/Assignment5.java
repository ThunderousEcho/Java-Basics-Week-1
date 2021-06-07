import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class Assignment5 {

	//returns null if no grouping exists
	public String groupSumClump(int startIndex, int[] arr, int target, String grouping) {
		
		int individualValue = arr[startIndex];
		startIndex++;
		int clumpSize = 1;
		
		while (startIndex < arr.length && arr[startIndex] == individualValue) {
			startIndex++;
			clumpSize++;
		}
		
		int clumpValue = clumpSize * individualValue;
		
		String groupingWithThisClump = ((grouping == null) ? "" : (grouping + ", ")) + individualValue + ((clumpSize == 1) ? "" : ("*" + clumpSize));
		
		//check whether this clump put us right on the target
		if (clumpValue == target) { 
			return groupingWithThisClump;
		}
		
		//check whether we're out of options on this recursion branch
		if (startIndex >= arr.length) { 
			return null;
		}
		
		//try taking this clump
		String result = groupSumClump(startIndex, arr, target - clumpValue, groupingWithThisClump);
		if (result != null) {
			return result;
		}
		
		//try not taking this clump
		return groupSumClump(startIndex, arr, target, grouping); 
	}
	
	@Test
	public void groupSumClump() {
		assertEquals("2, 8", groupSumClump(0, new int[] {2,4,8}, 10, null));
		assertEquals("1, 4, 8, 1", groupSumClump(0, new int[] {1,2,4,8,1}, 14, null));
		assertNull(groupSumClump(0, new int[] {2,4,4,8}, 14, null));
		
		assertEquals("2, -2", groupSumClump(0, new int[] {2, -2}, 0, null));
		assertEquals("1, 4, 8", groupSumClump(0, new int[] {1,2,4,8,1}, 13, null));
	}
}
