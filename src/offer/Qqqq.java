package offer;

import java.util.ArrayList;
import java.util.List;

public class Qqqq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {4,5,2,3};
		System.out.println(minNumberInRotateArray(input));
	}

	public static int minNumberInRotateArray(int[] array) {
		int tem1=0,tem2=0;
		if(array[0]<array[array.length-1]) {
			return 0;
		}
        if(array.length<1){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
         if(array[i]>array[i+1]){
        	 tem1=i;
         }   
        }
        for(int j=array.length-1;j>0;j--){
            if(array[j]<array[j-1]){
                tem2=j;
            }
        }
        if(tem1==tem2-1) {
        	return array[tem1+1];
        }else {
        	return 0;
        }
        
    }
   

}
