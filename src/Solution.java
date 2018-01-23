import java.util.Arrays;

public class Solution {
	public void wiggleSort(int[] nums) {
		if(nums.length == 0 || nums.length == 1)
			return;
        Arrays.sort(nums);
        int m = nums.length;
        int[] res = new int[m];
        int mid = (m - 1 / 2);
        
        for(int i = 0; i < m; i++){
        	int j = 0;
        	int k = 0;
        	if(i % 2 == 0)
        		res[i] = nums[j++];
        	else
        		res[i] = nums[mid + 1 + k++];
        }
        
        for(int i = 0; i < m; i++){
        	nums[i] = res[i];
        }
        		
    }
}
