package easy;

import java.util.Arrays;

public class Shuzupingfang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c= {-5,2,3};
		int[] d=sortedSquares(c);
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
//		Math.abs(a)
	}

	public  static int[] sortedSquares(int[] A) {
//		int[] b=new int[A.length];
//		int i=0;
//		int j=A.length-1;
//		while(A.length/2>0&&i<A.length/2&&j>=A.length/2) {
//			if(A[i]*A[i]>A[j]*A[j]) {
//				b[j]=A[i]*A[i];
//				i++;
//			}else {
//				b[j]=A[j]*A[j];
//				j--;
//			}
//			return b;
//		}
//		return A;
		if(A.length<1){
            return A;
        }
       for(int i=0;i<A.length;i++){
           A[i]*=A[i];
       }
       int temp;
       for(int k = 0;k < A.length;k++){ 
           for(int j = k + 1;j < A.length;j++){ 
               if(A[k] > A[j]){ 
                   temp = A[j]; 
                   A[j] = A[k]; 
                   A[k] = temp; 
               } 
           } 
       }
//       Arrays.sort(A);
       return A;
		
	}

}
