package easy;

public class Sssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-1532334236;
		System.out.println(reverse(x));
		/*if(x<0) {
			x=-x;
			String s=String.valueOf(x);
			String reverse=new StringBuilder(s).reverse().toString();;
			int number=Integer.parseInt(reverse);
			if(number>2147483647) {
				System.out.println("越界！！");
				return;
			}
			System.out.println(-number);
			return ;
		}
		String s=String.valueOf(x);
		String reverse=new StringBuilder(s).reverse().toString();;
		int number=Integer.parseInt(reverse);
		if(number>2147483647) {
			System.out.println("越界！！");
			return;
		}
		System.out.println(number);
//		while(x/10!=0) {
//			System.out.print(x%10);
//			x=x/10;
//		}
//		System.out.print(x%10);*/
	}


	public static int reverse(int x){  
		  int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) 
	            	return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
	            	return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	}
	

}
