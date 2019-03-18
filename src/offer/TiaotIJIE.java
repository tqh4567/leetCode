package offer;

public class TiaotIJIE {
	public static void main(String[] args) {
	System.out.println(JumpFloorII(3));
	}
	public static int JumpFloorII(int target) {
	       if(target<1){
	           return 0;
	       }else if(target==1){
	           return 1;
	       }else if(target==2){
	           return 2;
	       }else{
	           return (int) Math.pow(2,target-1);
	       }  
	    }
}
