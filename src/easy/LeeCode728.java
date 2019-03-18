package easy;

import java.util.ArrayList;
import java.util.List;

public class LeeCode728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selfDividingNumbers(1,22);
	}
	public static boolean check(int n) {
        int d = n;
        while (d != 0) {
            int c = d % 10;
            if (c == 0 || (n % c) != 0) return false; 
            d /= 10;
        }
        return true;
    }
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++) {
        	if(check(i)) {
        		list.add(i);
        	}
        }
        return list;
    }
}
