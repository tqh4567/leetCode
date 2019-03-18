package easy;

public class RLUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeCircle("UURDD"));
	}
	public static boolean judgeCircle(String moves) {
		if(moves.length()<2) {
			return false;
		}
		
        char[] array = moves.toCharArray();
        int cc=array.length;
        int U=0,D=0,R=0,L=0;
        for(int i=0;i<array.length;i++) {
        	if(array[i]=='U') {
        		U+=1;
        	}
        	if(array[i]=='D') {
        		D+=1;
        	}
        	if(array[i]=='R') {
        		R+=1;
        	}
        	if(array[i]=='L') {
        		L+=1;
        	}
        }
        if(U==D&&R==L) {
        	return true;
        }
		return false;
    }

}
