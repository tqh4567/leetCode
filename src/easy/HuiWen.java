package easy;

public class HuiWen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean bool=isPalindrome(1124211);
		System.out.println(bool);
		
	}
	public static boolean isPalindrome(int x) {
	     if(x<0) {
	    	 return false;
	     }
		String s = String.valueOf(x);
		String reverse = new StringBuilder(s).reverse().toString();
		if(reverse.equals(s)) {
			return true;
		}
		return false;
	}

}
