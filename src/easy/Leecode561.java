package easy;

public class Leecode561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2};
		int sum = arrayPairSum(a);
		
			System.out.println(sum);
		
		
	}
	public static int arrayPairSum(int[] nums) {
		
        for(int i=0;i<nums.length;i++) {
        	int temp;
        	for(int j=0;j<nums.length-i-1;j++) {
        		if(nums[j+1]<nums[j]) {
        			temp=nums[j+1];
        			nums[j+1]=nums[j];
        			nums[j]=temp;
        		}
        	}
        }
        int sum=0;
        int k=0;
        while(k<nums.length) {
        	sum=sum+(nums[k]>nums[k+1]?nums[k+1]:nums[k]);
        	k=k+2;
        }
        return sum;
    }
}
