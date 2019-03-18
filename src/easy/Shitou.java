package easy;

public class Shitou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=numJewelsInStones("aaSS", "a");
		int num =numJewelsInStones("acg", "");
		System.out.println(num);
	}
	public static int numJewelsInStones(String J, String S) {
		int num=0;
		if(J==null||S==null) {
			return 0;
		}
		char[] J1=J.toCharArray();
		char[] S2=S.toCharArray();
        for(int i=0;i<S2.length;i++) {
        	for(int j=0;j<J1.length;j++) {
        		if(J1[j]==S2[i]) {
        			num++;
        		}
        	}
        }
        return num;
    }
}
