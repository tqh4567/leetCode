package offer;

import java.util.HashMap;
import java.util.Map;

public class Xxxxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.pow(0, -2));
//		System.out.println("==================");
//		System.out.println(Power(0, -2));
		
		int[] a= {1,2,3,4,5,6,7,9,8,12};
		reOrderArray(a);
		Map<String,String> map=new HashMap<>();
		map.entrySet();

	}
	 public static int[] reOrderArray(int [] array) {
	      int a[]=new int[array.length];
	       int x=0;
	      for(int i=0;i<array.length;i++){
	          if(array[i]%2==0){
	              a[x++]=array[i];
	          }
	      }
	      for(int j=0;j<array.length;j++){
	          if(array[j]%2!=0){
	              a[x++]=array[j];
	          }
	      }
	      for(int k=0;k<array.length;k++){
	              array[k]=a[k];
	      }
	      return array;
	    }
	/**
	 * 求浮点数的正次幂
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double Power(double base, int exponent) {
	       double result=1.0;
	       if(exponent==0){
	           return 1;
	       }else if(exponent<0){
	           for(int i=exponent;i<0;i++){
	               result=result/base;
	           }
	           
	       }else{
	          for(int j=0;j<exponent;j++){
	               result=result*base;
	           } 
	       }
	        return result;
	  }

}
