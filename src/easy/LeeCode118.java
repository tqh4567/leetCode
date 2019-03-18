package easy;

import java.util.ArrayList;
import java.util.List;

public class LeeCode118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> generate(int numRows){
		
		List<List<Integer>> lists=new ArrayList<>();
		int[][] num=new int[numRows][numRows];
		for(int i=0;i<numRows;i++) {
			List<Integer> list=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0) {
					num[i][j]=1;
				}else if(i==j) {
					num[i][j]=1;
					
				}else {
					num[i][j]=num[i-1][j-1]+num[i-1][j];
				}
				list.add(num[i][j]);
			}
			lists.add(list);
			
		}
		return lists;
	}

}
