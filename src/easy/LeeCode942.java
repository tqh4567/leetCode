package easy;

public class LeeCode942 {

	public static void main(String[] args) {
		String s="III";
		diStringMatch(s);

	}
	public static int[] diStringMatch(String s) {
        int n=s.length();
        int m=n;
        int t=0;
        int[] result=new int[n+1];
        char[] charArray = s.toCharArray();
        for(int i=0;i<n;i++) {
        	if(charArray[i]=='D') {
        		result[i]=m--;
        	}
        	if(charArray[i]=='I'){
        		result[i]=t++;
        	}
        }
        if(charArray[n-1]=='D') {
    		result[n]=result[n-1]-1;
    	}
        if(charArray[n-1]=='I') {
    		result[n]=result[n-1]+1;
    	}
        return result;
    }
}
