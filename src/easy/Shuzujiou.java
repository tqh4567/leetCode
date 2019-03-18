package easy;


public class Shuzujiou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {1,2,2,3,3,3,3,3,3};
//		int[][] c= {{1,0},{-3,1},{-4,0},{2,3}};
//		int[] queries = sumEvenAfterQueries(b,c);
//		for (int i : queries) {
//			System.out.println(i);
//		}
		System.out.println(findShortestSubArray(b));
	}
	/**
	 * 697: 数组的度
	 * @param A
	 * @param queries
	 * @return
	 */
	public static int findShortestSubArray(int[] nums) {
		int m=0,n=0;
		
		
		int[] b=new int[10]; 
		for(int i=0;i<nums.length;i++){
			b[nums[i]]++; 
		} 
		int max=b[0]; //定义次数
		int value=0; //定义最大值 
		for(int i=1;i<b.length;i++){ 
			if(b[i]>max){ 
				max=b[i];
				value=i; 
			} 
		}
		int i=0,j=nums.length-1;
		while(i<nums.length) {
			if(nums[i]==value) {
				m=i;
				return m;
			}else {
				i++;
			}
		}
		while(j>0) {
			if(nums[j]==value) {
				n=j;
				return n;
			}else {
				j++;
			}
		}
		return n-m;
        /*int max=1,num=1,temp=0,index=0,q=1, maxnumber=1;
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			num=num+1;
        		}
        	}
        	if(max<num) {
    			temp=max;
    			max=num;
    			num=temp;
    		}
        	
        }
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			q=q+1;
        		}
        	}
        	if(q==max) {
    			maxnumber=nums[i];
    		}
        	
        }*/
//        return max;
    }
	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
			int[] result =new int[A.length];
			for(int i=0;i<queries.length;i++) {
				int index=queries[i][1];
				A[index]+=queries[i][0];
				int num=0;
				for(int k=0;k<A.length;k++) {
					if(A[k]%2==0) {
						num+=A[k];
					}
				}
				result[i]=num;
			}
			return result;
	    }
	/**
	 * 把数组中奇偶数进行隔离
	 * @param A
	 * @return
	 */
	public static int[] sortArrayByParity(int[] A) {
		int i=0,j=A.length-1,temp;
		while(j>i) {
			if(A[i]%2==0) {
				i++;
			}else {
				temp=A[j];
				A[j]=A[i];
				A[i]=temp;
				j--;
			}
		}
		return A;
	}
	/**
	 * 
	 * 查找相同元素的字母
	 * @param A
	 * @return
	 */
	public static int repeatedNTimes(int[] A) {

        while(A.length%2==0&&A.length>=4) {
        	for(int i=0;i<A.length;i++ ) {
        		for(int j=i+1;j<A.length;j++) {
        			if(A[i]==A[j]) {
        				return A[i];
        			}
        		}
        	}
        	
        }
        return 0;
    }
	
}
