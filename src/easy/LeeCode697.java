package easy;

public class LeeCode697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s= {1, 2, 2, 3, 1};
		System.out.println(findShortestSubArray(s));
		
	}
	public static int findShortestSubArray(int[] nums) {
        int i=0,max=0;
        int j=nums.length-1;
    	while(nums[i]!=nums[j]) {
    		i++;
    	}
    	while(nums[i]==nums[j]) {
    		if(max<j-i) {
    			max=j-i;
    		}
    		j--;
    	}
    	return max+1;
    }

}
