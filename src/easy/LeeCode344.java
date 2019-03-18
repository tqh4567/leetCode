package easy;

public class LeeCode344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s= {'1','2','4','5','6'};
		reverseString(s);
	}
	public static char[] reverseString(char[] s) {
		char tem;
		int j=s.length-1;
		for(int i=0;i<s.length/2;i++) {
			tem=s[i];
			s[i]=s[j-i];
			s[j-i]=tem;
		}
		return s;
    }

}
