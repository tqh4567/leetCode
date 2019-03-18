package easy;

public class LeeCode507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(1));
	}
	public static boolean checkPerfectNumber(int num) {
		int max=0;
        for(int i=1;i<=num/2;i++) {
        	if(num%i==0) {
        		max=max+i;
        	}
        }
        if(max==num) {
        	return true;
        }else {
        	return false;
        }
        
    }

}
