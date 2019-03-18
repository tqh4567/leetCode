package niuke;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double n = scanner.nextDouble();
		int m = scanner.nextInt();
//		System.out.println(result(n,m));
		System.out.println(fun(5));
	}
	 public static int fun (int n) {
		 int x = 1, k;
		 if (n == 1) return x;
		 for(k = 1;  k < n;  ++k)
		 x = x + fun(k) * fun(n-k);
		 return x;
		 }
	public static String result(double n,double m) {
		if(n<=0||n>=100) {
			return "0";
		}
		if(m<=0||m>25) {
			return "0";
		}
		BigDecimal bigDecimal=new BigDecimal(Math.pow(n, m));
		return bigDecimal.toPlainString();
	}

}
