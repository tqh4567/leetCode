package easy;

public class LeeCode832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		flipAndInvertImage(A);
	}
	public static int[][] flipAndInvertImage(int[][] A) {
       int j=A[0].length;
//       int n=j-1;
       int tem=0;
       for(int i=0;i<A.length;i++) {
    	   for(int m=0,n=j-1;m<j/2;m++,n--) {
    		   tem=A[i][n];
    		   A[i][n]=A[i][m];
    		   A[i][m]=tem;
    	   }
    	   for(int k=0;k<j;k++) {
    		   if(A[i][k]==1) {
    			   A[i][k]=0;
    		   }
    		   else {
    			   A[i][k]=1;
    		   }
    	   }
    	   
       }
       return A;
    }

}
